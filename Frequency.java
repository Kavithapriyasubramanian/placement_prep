// You are using Java
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replaceAll(" ","");
        int n=s.length();
        int freq[]=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                System.out.println((char)(i+'a')+" occurs "+freq[i]+" times in the string");
            }
        }
        
    }
}