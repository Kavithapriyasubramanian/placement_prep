// Find the Nth term
// You need to find the Nth term in a mixed series where the odd terms form one geometric series and the even terms
// form another geometric series.
// the series 1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243, 64, 729, 128, 2187, ...
// Input
// A single integer N, which is a positive integer not exceeding 30.
// Output
// A single integer which is the Nth term of the series.
// Example
// Input:

// 5
// Output:


/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int t=0;
        int s=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[i]=(int)Math.pow(2,t++);
            }
            else{
                arr[i]=(int)Math.pow(3,s++);
            }
        }
        System.out.println(arr[n-1]);

	}
}

