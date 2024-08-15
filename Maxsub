// import java.util.*;
// public class Maxsub {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter size");
//         int size=sc.nextInt();
//         int arr[]=new int[size];
        
//         System.out.println("enter the array");
//         for (int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("enter the sum"+max_sum(arr));
//     }

//     public static int max_sum(int arr[]){
//         int maxsum=arr[0];
//         int sum=arr[0];
//         int maxstart=0;
//         int maxend=0;
//         for(int i=0;i<arr.length;i++){
//             if(sum>=0){
//                 sum=sum+arr[i];
//             }
//             else{
//                 sum=arr[i];
//                 maxstart=i;
//             }
//              if(sum>=maxsum){
//                 maxsum=sum;
//                 maxend=i;
//             }
           
            
//         }
        
     
//      System.out.println("subarray:");
//     for(int k=maxstart;k<=maxend;k++){
//         System.out.print(arr[k]+" ");
//      }
//     System.out.println();

//     return maxsum; 
// }

    
// }
import java.util.*;
class Maxsub{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int maxsum=0;
        int maxstart=arr[0];
        int maxend=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                sum=sum+arr[i];
            }
            else{
                sum=0;
                maxstart=i;
            }

            if(sum>maxsum){
                maxsum=sum;
                maxend=i;
            }
        }

        System.out.println(maxsum);
        for(int k=maxstart;k<=maxend;k++){
            System.out.println(arr[k]+" ");


        }
    }
}