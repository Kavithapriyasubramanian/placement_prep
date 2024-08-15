// import java.util.*;
// public class Trap{
//     public static int trap(int[] arr){
//         int res=0;
//         for(int i=1;i<arr.length-1;i++){

//             int lb=arr[i];

//             for(int j=0;j<i;j++){
//                 if(lb<arr[j]){
//                     lb=arr[j];
//                 }
//             }


//             int rb=arr[i];

//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[j]>rb){
//                     rb=arr[j];
//                 }
//             }

//             int wl;
//             if(rb>lb){
//                 wl=lb;
//             }
//             else{
//                 wl=rb;
//             }

//             int tw=wl-arr[i];
//             res=res+tw;

//         }
//         return res;

//     }



// public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter size");

//     int size=sc.nextInt();
//     int arr[]=new int[size];

//     System.out.println("enter the array");

//     for(int i=0;i<size;i++){
//     arr[i]=sc.nextInt();
// }
//    int trappedwater=trap(arr);
//  System.out.println("traped water"+trappedwater);

// }
// }
import java.util.*;
class Trap{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=0;
        for(int i=1;i<n-1;i++){
            int lb=arr[i];
            for(int j=0;j<i;j++){
                if(arr[j]>lb){
                    lb=arr[j];
                }
            }
            int rb=arr[i];
            for(int j=i+1;j<n;j++){
                if(arr[j]>rb){
                    rb=arr[j];
                }
            }
            int wt=0;

            if(lb<rb){
                wt=lb;
            }
            else{
                wt=rb;
            }
            int tw=wt-arr[i];
            res=res+tw;
        }
        System.out.println("max "+res);
    }
}