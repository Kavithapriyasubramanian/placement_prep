import java.util.*;
public class Strreverse{
    public static void main(String args[]){
        //Scanner sc=new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        
       
        StringBuilder sb=new StringBuilder(input);
         
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;

            char frontchar=sb.charAt(front);
            char backchar=sb.charAt(back);

            sb.setCharAt(front,backchar);
            sb.setCharAt(back,frontchar);
        }
        System.out.println(sb);



    }
}