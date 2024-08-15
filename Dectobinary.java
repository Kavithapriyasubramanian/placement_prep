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
        String bin=Integer.toBinaryString(n);
        String res="";
        for(char c:bin.toCharArray()){
            if(c=='0'){
                res=res+'1';
            }
            else{
                res=res+'0';
            }
        }
        System.out.println(Integer.parseInt(res,2));
        
	}
}