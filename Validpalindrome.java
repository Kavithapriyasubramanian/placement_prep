// import java.util.*;
// class Validpalindrome{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         System.out.println(sol(s));
//     }
//     public static boolean sol(String s){
//         int left=0;
//         int right=s.length()-1;
//         while(left<right){
//             if(s.charAt(left)==s.charAt(right)){
//                 left++;
//                 right--;
//             }
//             else{
//                 return false;
//             }
//         }
//         return true;
        
//     }
// }
import java.util.*;
class Validpalindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(sol(s));
    }
    public static boolean sol(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}