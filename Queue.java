import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Queue<Integer>q=new LinkedList<>();
        for(int i=1;i<=n;i++){
            int query=sc.nextInt();
            if(query==1){
                int x=sc.nextInt();
                q.add(x);
            }
            if(query==2){
                if(!q.isEmpty()){
                    System.out.println(q.remove());
                }
                else{
                    System.out.println(-1);
                }
            }
            if(query==3){
                System.out.println(q.peek());
            }
            if(query==4){
                System.out.println(q.size());
            }
            if(query==5){
                System.out.println(q.isEmpty());
            }
        }
    }
}s