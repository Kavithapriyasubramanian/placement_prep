import java.util.*;
class Strictlyinc{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sol(arr));
    }
    public static int sol(int arr[]){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n-1;i++){
        if(arr[i]>arr[i+1]){
            count++;
        }
    }
        return count;
    }
}