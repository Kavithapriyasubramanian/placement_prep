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
        Map<Character,Integer>map=new HashMap<>();
        map.put('I',1);
         map.put('V',5);
         map.put('X',10);
         map.put('L',50);
         map.put('C',100);
         map.put('D',500);
        map.put('M',1000);
        int res=map.get(s.charAt(s.length()-1));
        
        for(int i=s.length()-2;i>=0;i--){
            if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                res=res-map.get(s.charAt(i));
            }
            else{
                res=res+map.get(s.charAt(i));
            }
        }
        return res;
    }
}