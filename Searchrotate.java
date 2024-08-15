// import java.util.*;

// public class Searchrotate {

//     public static int search(int[] arr, int target) {
//         int left = 0;
//         int right = arr.length - 1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;

//             if (arr[mid] == target) {
//                 return mid;
//             }

//             if (arr[left] <= arr[mid]) {
//                 if (arr[left] <= target && target < arr[mid]) {
//                     right = mid - 1;
//                 } else {
//                     left = mid + 1;
//                 }
//             } else {
//                 if (arr[mid] < target && target <= arr[right]) {
//                     left = mid + 1;
//                 } else {
//                     right = mid - 1;
//                 }
//             }
//         }

//         return -1; // If the target is not found in the array
//     }

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.println("Enter the size of array:");
//         int n = scn.nextInt();
//         int[] arr = new int[n];

//         System.out.println("Enter the array");
//         for (int i = 0; i < n; i++) {
//             arr[i] = scn.nextInt();
//         }

//         System.out.println("target");
//         int target = scn.nextInt();
//         int ans = search(arr, target);
//         System.out.println(ans);
//     }
// }
import java.util.*;
class Searchrotate{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //int target=sc.nextInt();
        System.out.println(search(n,arr));
    }
    public static int search(int n,int arr[]){
        int left=0;
        int right=n-1;
       while(left<=right){
            int mid=left+(right-left)/2;

            if(arr[left]<=arr[mid]){
                right=mid-1;
            }
            else{
                    left=mid+1;
                }
        }
        return -1;
    }
}