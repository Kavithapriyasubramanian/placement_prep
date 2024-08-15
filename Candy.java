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
        int left[]=new int[n];
        int right[]=new int[n];
        Arrays.fill(left,1);
        Arrays.fill(right,1);
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                left[i]=left[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                right[i]=right[i+1]+1;;
            }
        }
    
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+Math.max(left[i],right[i]);
        }
        System.out.println(sum);
    }
}