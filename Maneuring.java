import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(path(n,m));
    }
    public static int path(int n,int m){
        if(m==1 || n==1){
            return 1;
        }
        return path(n-1,m)+path(n,m-1);
    }
}