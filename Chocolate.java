// import java.util.*;

// public class Chocolate {

//     public static int find(int[] arr, int n, int m) {
//         // Sort the array to make it easier to find the minimum difference
//         Arrays.sort(arr);
        
//         int minDiff = Integer.MAX_VALUE;
        
//         for (int i = 0; i + m - 1 < n; i++) {
//             int diff = arr[i + m - 1] - arr[i];
//             if (diff < minDiff) {
//                 minDiff = diff;
//             }
//         }
        
//         return minDiff;
//     }

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);

//         // Input work
//         int n = scn.nextInt();
//         int[] arr = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = scn.nextInt();
//         }

//         int m = scn.nextInt();
//         int ans = find(arr, n, m);

//         System.out.println(ans);
//     }
// }

import jva.util.*;
class Chocolate{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        System.out.println(n,arr,m);
    }
    public static int choco(int n,int arr[],int m){
        Arrays.sort(arr);
        int mindiff=Integer.MAX_VALUE;
        for(int i=0;i+m-1<n;i++){
            int diff=arr[i+m-1]-arr[i];
            int mindiff=Math.min(mindiff,diff);
        }
        return mindiff;
    }
}