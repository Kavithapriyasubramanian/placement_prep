// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int cat=fact(2*n)/(fact(n+1)*fact(n));
//         System.out.println(cat);
//     }
//     public static int fact(int n){
//         //int res[]=new int[n];
// //res[0]=1;
//         if(n==0 || n==1){
//             return 1;
//         }
//         int f=1;
//         for(int i=2;i<=n;i++){
//             f=f*i;
//         }
//         return f;
        
//     }
// }


import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger cat = catalan(n);
        System.out.println(cat);
    }

    public static BigInteger catalan(int n) {
        BigInteger num = fact(2 * n);
        BigInteger den = fact(n + 1).multiply(fact(n));
        return num.divide(den);
    }

    public static BigInteger fact(int n) {
        BigInteger f = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
}
