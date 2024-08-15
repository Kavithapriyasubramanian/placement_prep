// import java.util.*;
// class Stock{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int min=arr[0];
//         int profit=0;
//         int maxprofit=0;
//         int temp=0;
//         int buy=0;
//         int sell=0;
//         for(int i=0;i<n;i++){
//             if(arr[i]<min){
//                 min=arr[i];
//                 temp=i;
//             }
//             profit=arr[i]-min;
//             //maxprofit=Math.max(profit,maxprofit);
//             if(profit>maxprofit){
//                 maxprofit=profit;
//                 buy=temp;
//                 sell=i;
//             }
//         }
//         System.out.println(maxprofit);
//         System.out.println(arr[buy]);
//         System.out.println(arr[sell]);
//     }
// }

import java.util.*;
class Stock{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int profit=0;
        int maxprofit=0;
        int min=arr[0];
        int maxstart=0;
        int maxend=0;
        int temp=0;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
                temp=i;
            }
            profit=arr[i]-min;
            if(profit>maxprofit){
                maxprofit=profit;
                maxstart=temp;
                maxend=i;
            }

        }
        System.out.println(maxprofit);
        System.out.println(arr[maxstart]);
        System.out.println(arr[maxend]);
    }
}