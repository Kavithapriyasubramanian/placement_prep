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
        int rep=0;
        int miss=0;
        for(int i=0;i<n;i++){
            int ele=Math.abs(arr[i]);
            if(arr[ele-1]>0){
                arr[ele-1]=-arr[ele-1];
            }
            else{
                rep=ele;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                miss=i+1;
                break;
            }
        }
        System.out.print(miss);
    }
}