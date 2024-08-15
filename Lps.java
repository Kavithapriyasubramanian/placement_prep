import java.util.*;
class Lps{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(lp(s));
        
    }

        public static int lp(String s){
            int n=s.length();

        int arr[][]=new int[n][n];
        for(int i=0;i<s.length();i++){
            arr[i][i]=1;
        }

        for(int i=n-2;i>=0;i--){
            for(int j=i+1;j<n;j++){
                if(s.charAt(i)==s.charAt(j)){
                    arr[i][j] = 2 + arr[i+1][j-1];
                }
                else{
                    arr[i][j]=Math.max(arr[i+1][j],arr[i][j-1]);
                }
            }
        }
        return arr[0][n-1];
    }
}