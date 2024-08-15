import java.util.*;
public class Contiguous {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(con(arr));
    }
    public static boolean con(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]+1 || arr[i]==arr[i+1]){
                    return true;
                }
            }
        }
        return false;
    }
    
}
