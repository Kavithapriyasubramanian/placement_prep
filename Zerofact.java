import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sol(n));
    }
    public static int sol(int n){
        int count=0;
        for(int i=5;n/i>=1;i*=5){
            count=count+n/i;
        }
        return count;
    }
}