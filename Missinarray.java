import java.util.*;
public class Missinarray {
    public  static int find(int n,int arr[]){
        int arr1[]=new int[n+1];
        for(int i=0;i<n+1;i++){
            arr1[i]=0;
        }
        for(int i=0;i<n;i++){
            arr1[arr[i]-1]=1;
        }
        int ans=0;
        for(int i=0;i<n+1;i++){
            if(arr1[i]==0){
                ans=i+1;
            }
            
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(find(n, arr));
    }
    
}
