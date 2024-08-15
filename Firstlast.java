import java.util.*;
class Firstlast{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int last=n%10;
        System.out.println("last "+last);
        //int first=n;
        while(n>=10){
            n=n/10;
        }
        System.out.println(n);

    }
}