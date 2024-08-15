import java.util.*;
public class Stringdup{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //int size=sc.nextInt();
        String s=sc.nextLine();
        int[] arr=new int[256];


        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }

        for(int i=0;i<256;i++){
            if(arr[i]>1){
                System.out.println((char)(i)+" count="+arr[i]);
            }

    }
}
}