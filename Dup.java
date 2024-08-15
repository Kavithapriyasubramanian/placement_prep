// import java.util.*;
// public class Dup {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the array");
//         int size=sc.nextInt();
//         int arr[]=new int[size];

//         System.out.println("enter the array");
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }

//         boolean[] isDuplicate=new boolean[size];

//         for(int i=0;i<size-1;i++){
//             if(!isDuplicate[i]){
//             for(int j=i+1;j<size;j++){
//                 if( arr[i]== arr[j]){
//                     System.out.println("duplicate" +arr[i]);
//                     isDuplicate[j]=true;
//                 }

//                 }

//             }
//         }
//     } 
// }
import java.util.*;
class Dup{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(dupli(n,arr));
    }
    public static boolean dupli(int n,int arr[]){
        boolean dup=false;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
