/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Compressstring
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      StringBuilder sb=new StringBuilder();
      int count=1;
      for(int i=0;i<s.length();i++){
          if(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
              count++;
          }
          else{
              sb.append(s.charAt(i));
              if(count>1){
                  sb.append(count);
              }
              count=1;
          }
          
      }
      System.out.println(sb.toString());
	}
}
