import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String p=sc.nextLine();
        int row=s.length();
        int col=p.length();
        boolean dp[][]=new boolean[row+1][col+1];
        dp[0][0]=true;
        for(int i=1;i<=col;i++){
            if(p.charAt(i-1)=='*'){
                dp[0][i]=dp[0][i-2];
            }
        }
        
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(s.charAt(i-1)==p.charAt(j-1)|| p.charAt(j-1)=='.'){
                    dp[i][j]=dp[i-1][j-1];
                }
                else if(j>1 && p.charAt(j-1)=='*'){
                    dp[i][j]=dp[i][j-2];
                    if(p.charAt(j-2)=='.' ||p.charAt(j-2)==s.charAt(i-1)){
                        dp[i][j]=dp[i][j]||dp[i-1][j];
                    }
                }
            }
        }
        System.out.print(dp[row][col]);
    }
}