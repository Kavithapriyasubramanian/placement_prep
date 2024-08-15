import java.util.*;
class Firstrepeatcharacter{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int index=Integer.MAX_VALUE;
        char ans=' ';
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    if(j<index){
                        index=j;
                        ans=s.charAt(j);
                    }
                }
            }
        }
        System.out.println(ans+" ");
    }
}