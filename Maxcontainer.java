// import java.util.*;
// class Maxcontainer{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int left=0;
//         int right=n-1;
//         int maxarea=0;
//         while(left<right){
//             int area=Math.min(arr[right],arr[left])*(right-left);
//             maxarea=Math.max(maxarea,area);
//             if(arr[left]<arr[right]){
//                 left++;
//             }
//             else{
//                 right--;
//             }
//         }
//         System.out.println(maxarea);
//     }
// }
import java.util.*;
class Maxcontainer{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int area=0;
        int maxarea=0;
        int left=0;
        int right=n-1;

        
        while(left<right){
            area=Math.min(arr[left],arr[right])*(right-left);
            maxarea=Math.max(area,maxarea);
            if(arr[left]<arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.print(maxarea);
    }
}