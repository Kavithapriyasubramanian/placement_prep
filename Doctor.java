// Amount calculation
// A doctor has a clinic where he serves his patients. The doctor’s consultation fees are different for different groups of patients, depending on their age. If the patient’s age is below 17, fees is 200 INR. If the patient’s age is between 17 and 40, fees is 400 INR. If the patient's age is above 40, the fee is 300 INR. Write a code to calculate earnings in a day for which one array/List of values representing the age of patients visited on that day is passed as input.

// Note:
// 1. Age should not be zero or less than zero or above 120
// Doctor consults a maximum of 20 patients a day
// 2. Input and Output Format should be same as given in the example.
// For any wrong input display INVALID INPUT
// Input
// A line consists of the “age” (0<age<120) of the patient separated by white space
// Output
// Print the total amount
// Example
// Input:

// 15 22 45 0
// Output:

// INVALID INPUT


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
        String s=sc.nextLine();
        String str[]=s.split(" ");
        int n=str.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(str[i]);
        }
        int res=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
            if(arr[i]<=17 & arr[i]>0){
                res=res+200;
            }
            else if(arr[i]>17 && arr[i]<=40){
                res=res+400;
            }
            else if(arr[i]>40 && arr[i]<120){
                res=res+300;
            }
            }
            else{
                System.out.println("INVALID INPUT");
               return;
            }
        }
        System.out.println(res);
	}
}