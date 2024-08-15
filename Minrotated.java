import java.util.*;
public class Minrotated {
    public static int Min(int[] arr){
        int size=arr.length;
        int left=0;
        int right=size-1;

        while(left<right){
            int mid=left+(right-left)/2;

            if(arr[mid]>arr[right]){
                left=mid+1;
            }
            else{
                right=mid;
            }

        }
        return arr[left];
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int size=sc.nextInt();

        int[] arr=new int[size];

        System.out.println("Enter the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println("minimum :");
        int ans=Min(arr);
        System.out.println(ans);
    }
    
}
