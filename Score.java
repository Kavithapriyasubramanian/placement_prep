import java.util.*;
class Score{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
        System.out.println(sol(n));
    }
    public static int sol(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i]+dp[i-3];
        }
        for(int i=5;i<=n;i++){
            dp[i]=dp[i]+dp[i-5];
        }
        for(int i=10;i<=n;i++){
            dp[i]=dp[i]+dp[i-10];
        }
        return dp[n];
    }
}