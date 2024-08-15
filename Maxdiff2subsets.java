// You are using Java
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Maximum Difference = "+sol(n,arr));
        
    }
    public static int sol(int n,int arr[]){
        int res=0;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                res=res+Math.abs(arr[i]);
            }
            else{
                i++;
            }
        }
        if(arr[n-2]!=arr[n-1]){
            res=res+Math.abs(arr[n-1]);
        }
        return res;
    }
}