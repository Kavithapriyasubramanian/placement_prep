import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(sol(s));
        
    }
    public static int sol(String s){
        int res=0;
        for(int i=0;i<s.length();i++){
            res=res*26;
            res=res+s.charAt(i)-'A'+1;
        }
        return res;
    }
}