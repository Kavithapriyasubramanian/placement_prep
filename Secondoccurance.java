import java.util.*;
public class Secondoccurance {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        char result='\0';

        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    result=s.charAt(j);
                    break;
                }
            }
        }
        System.out.println(result);
    }
    
}
