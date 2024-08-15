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
            int k=sc.nextInt();
            sol(n,arr,k);
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
        }
        public static void sol(int n,int arr[],int k){
            if(k==0){
                return;
            }
            int temp=arr[n-1];
            for(int i=n-1;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=temp;
            sol(n,arr,k-1);
        }
            
	}