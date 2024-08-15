// count the number of rock samples
// John is a geologist, and he needs to count rock samples in order to send them to a chemical laboratory. 
// The laboratory only accepts rock samples within specified size ranges in ppm (parts per million). John needs 
// your help to determine the number of rock samples within each specified range.

// Given an array samples[] representing the sizes of rock samples and a 2D array ranges[] where each sub-array contains
// two integers representing the start and end of a range, your task is to count the number of rock samples that fall
// within each range.
// Input
// The first line contains two space-separated integers:
// S: the number of rock samples.
// R: the number of ranges.
// The second line contains S space-separated integers representing the sizes of the rock samples.
// The subsequent R lines contain two space-separated integers each, representing the start and end of a range.
// Output
// R lines where the ith line contains a single non-negative integer indicating the number of samples that lie in the ith range.
// Example
// Input:

// 5 3
// 10 20 30 40 50
// 15 35
// 20 50
// 10 60
// Output:

// 2
// 4
// 5


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
        int rock=sc.nextInt();
        int ran=sc.nextInt();
        int arr[]=new int[rock];
        for(int i=0;i<rock;i++){
            arr[i]=sc.nextInt();
        }
        int range[][]=new int[ran][2];
        for(int i=0;i<ran;i++){
                range[i][0]=sc.nextInt();
                range[i][1]=sc.nextInt();
        }
        int res[]=new int[ran];
        for(int i=0;i<rock;i++){
            for(int j=0;j<ran;j++){
                if(arr[i] >= range[j][0] && arr[i] <= range[j][1]) {
                    res[j]++;
                }
            }
        }
       for(int i=0;i<ran;i++){
           System.out.println(res[i]+" ");
       }
	}
}