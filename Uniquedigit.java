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
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(sol(n1,n2));
	}
    public static int sol(int n1,int n2){
        //boolean visited[]=new boolean[10];
        int count=0;
        for(int i=n1;i<=n2;i++){
            boolean visited[]=new boolean[10];
            int num=i;
            while(num>0){
                if(visited[num%10]==true){
                    break;
                }
                visited[num%10]=true;
              num=num/10;
            }
            if(num==0){
            count++;
        }
        }
        return count;
    }
}