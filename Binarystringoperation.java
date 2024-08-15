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
        System.out.println(sol(s));
	}
    public static int sol(String s){
        if(s.length()%2==1 || s.length()==0){
            return -1;
        }
        int res=s.charAt(0)-'0';
        for(int i=1;i<s.length();i+=2){
            char c=s.charAt(i);
            int d=s.charAt(i+1)-'0';
            if(c=='A'){
                res=res&d;
            }
            else if(c=='B'){
                res=res|d;
            }
            else if(c=='C'){
                res=res^d;
            }
            else{
                return -1;
            }

        }
        return res;
    }
}