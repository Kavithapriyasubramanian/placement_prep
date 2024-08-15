import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int median=n%2==0 ? (arr[n/2]+arr[(n)/2-1])/2: arr[n/2];
        
        int steps=0;
        for(int num:arr){
            steps=steps+Math.abs(num-median);
        }
        System.out.println(steps);
    }
}