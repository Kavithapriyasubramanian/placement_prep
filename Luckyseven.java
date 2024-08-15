/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int num=7;
        System.out.println(sol(n,arr,num));
	}
    public static boolean sol(int n,int arr[],int num){
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+2;k<n;k++){
                    if(arr[k]+arr[i]+arr[j]<=num){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
