public /* package whatever; // don't place package name! */

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
        HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
        hm.put('A',10);
        hm.put('B',11);
        hm.put('C',12);
        hm.put('D',13);
        hm.put('E',14);
        hm.put('F',15);
        hm.put('G',16);
        hm.put('a',10);
        hm.put('b',11);
        hm.put('c',12);
        hm.put('d',13);
        hm.put('e',14);
        hm.put('f',15);
        hm.put('g',16);
        int num=0;
        int k=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if((ch>='a' && ch<='g') || (ch>='A' && ch<='G')){
                num=num+hm.get(ch)*(int)Math.pow(17,k++);
            }
            else if(Character.isDigit(ch)){
                num=num+(ch-'0')*(int)Math.pow(17,k++);
            }
            else{
                System.out.println("Invalid");
                return;
            }
        }
        System.out.println(num);

        
	}
} {
    
}
