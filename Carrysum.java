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
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(sol(n1,n2));
	}
    public static int sol(int n1,int n2){
        int count=0;
        int temp1=n1;
        int temp2=n2;
        int rem=0;
        while(temp1!=0 && temp2!=0){
            int d1=temp1%10;
            int d2=temp2%10;
            if((d1+d2+rem)>9){
                count++;
                int sum=d1+d2+rem;
                sum=sum/10;
                rem=sum;
            }

            temp1=temp1/10;
            temp2=temp2/10;
        }
        return count;
    }
}
