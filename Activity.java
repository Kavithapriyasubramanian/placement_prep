import java.io.*;
import java.util.*;

public class Activity {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            
            arr1[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int arr2[]=new int[m];
        for(int j=0;j<m;j++){
            arr2[j]=sc.nextInt();
        }
        
        int ce=0;
        System.out.print(ce+" ");
        for(int i=0;i<n;i++){
            if(arr2[ce]<=arr1[i]){
                ce=i;
                System.out.print(ce+" ");
            }
        }
    }
}