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
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int evenn=0;
        int oddn=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                evenn++;
            }
            else{
                oddn++;
            }
        }
        int even[]=new int[evenn];
        int odd[]=new int[oddn];
        int evenindex=0;
        int oddindex=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
            even[evenindex++]=arr[i];
            }
            else{
                odd[oddindex++]=arr[i];
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        System.out.println(even[evenn-2] + odd[oddn-2]);
	}
}
