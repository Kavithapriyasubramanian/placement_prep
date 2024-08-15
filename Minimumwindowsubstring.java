import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        String res="";
        if(t.length()>s.length()){
            System.out.println(res);
            return;
        }
        int arr[]=new int[128];
        for(char ch:t.toCharArray()){
            arr[ch]++;
        }
        char sch[]=s.toCharArray();
        int left=0;
        int right=0;
        int found=0;
        int tofind=t.length();
        int minlen=Integer.MAX_VALUE;
        while(right<s.length()){
            char ch=sch[right];
            arr[ch]--;
            if(arr[ch]>=0){
                found++;
            }
            while(found==tofind){
                if(minlen>(right-left+1)){
                    minlen=right-left+1;
                    res=s.substring(left,right+1);
                }
                arr[sch[left]]++;
                if(arr[sch[left]]>0){
                    found--;
                }
                left++;
            }
            right++;
        }
        System.out.println(res);
    }
}