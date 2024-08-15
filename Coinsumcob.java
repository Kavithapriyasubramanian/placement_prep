// You are using
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        System.out.println(countWays(arr,n,m));
    }
    public static int countWays(int arr[],int n,int m){
        if(m==0){
            return 1;
        }
        if(m<0){
            return 0;
        }
        if(n<=0){
            return 0;
        }
        return countWays(arr,n-1,m)+countWays(arr,n,m-arr[n-1]);
    }
}