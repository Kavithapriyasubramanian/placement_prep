import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int minflip=0;
        int onecount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                onecount++;
            }
            else{
                minflip=Math.min(minflip+1,onecount);
            }
        }
        System.out.println(minflip);
    }
}