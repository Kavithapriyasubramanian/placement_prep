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
        String s=sc.nextLine();
        int count1=0;
        int count2=0;
        for(char c:s.toCharArray()){
            if(c=='*'){
                count1++;
            }
            if(c=='#'){
                count2++;
            }
        }
        if(count1==count2){
            System.out.println("0");
        }
        else if(count1>count2){
            System.out.println("positive integer");
        }
        else{
            System.out.println("negative integer");
        }
	}
}