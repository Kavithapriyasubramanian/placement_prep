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
        int rats=sc.nextInt();
        int each_ratfood=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int totalfood=rats*each_ratfood;
        int sum=0;
        int index=-1;
        for(int i=0;i<n;i++){
            if(sum<totalfood){
                sum=sum+arr[i];
                index=i;
            }
        }
        System.out.println(index+1);
	}
}
