import java.util.*;
public class Stringb {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String result="";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                result=result+'i';
            }
            else{
                result=result+str.charAt(i);
            }

        }
        System.out.println(result);


    }
    
}
