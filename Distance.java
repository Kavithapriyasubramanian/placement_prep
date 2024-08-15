/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes her
        Scanner sc=new Scanner(System.in);
        float x1=sc.nextFloat();
        float y1=sc.nextFloat();
        float x2=sc.nextFloat();
        float y2=sc.nextFloat();
        float x3=sc.nextFloat();
        float y3=sc.nextFloat();

        //double dis=Math.sqrt(Math.pow(x2-x1)^2+(y2-y1),2)+Math.sqrt(Math.pow(x3-x2),2+(y3-y2)^2)+Math.sqrt((x3-x1)^2+(y3-y1)^2);
        float dis1=(float)Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        float dis2=(float)Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));
        float dis3=(float)Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2));
        float dis=dis1+dis2+dis3;
        
        System.out.println(dis);
    
	}
}