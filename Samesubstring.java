import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String words[]=sc.nextLine().split(" ");
        int n=words.length;
        List<String>res=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && words[j].contains(words[i])){
                    res.add(words[i]);
                    break;
                }
            }
        }
        System.out.println(res);
    }
}