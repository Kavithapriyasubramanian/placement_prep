import java.util.*;
import java.util.Arrays;
class Londestpath{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int mat[][]=new int[n][m];
        //int dp[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
                //dp[i][j]=-1;
            }
        }
        System.out.println(sol(mat,n,m));
    }
    public static int sol(int mat[][],int n,int m){
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++){
             Arrays.fill(dp[i],-1);
        }
        return solve(mat,n,m,dp,0,0);
    }
    public static int solve(int mat[][],int n,int m,int dp[][],int i,int j){
        if(dp[i][j]<0){
            int res=0;
            if(i==n-1 && j==m-1){
                return dp[i][j]=1;
             }
             if(i==n-1 || j==m-1){
                 res=1;
             }
             int down=0;
             int right=0;
             if(i+1<n && mat[i+1][j]>mat[i][j]){
                 down=1+solve(mat,n,m,dp,i+1,j);
             }
             if(j+1<m && mat[i][j+1]>mat[i][j]){
                 right=1+solve(mat,n,m,dp,i,j+1);
             }
             res=Math.max(right,down);
             dp[i][j]=res;
        }
        
        return dp[i][j];
    }
}

// import java.util.Scanner;
// import java.util.Arrays;

// class GFG {

//     // Return the length of LIP in 2D matrix
//     static int LIP(int dp[][], int mat[][], int n, int m, int x, int y) {
//         // If value not calculated yet.
//         if (dp[x][y] < 0) {
//             int result = 0;

//             // If reach bottom right cell, return 1.
//             if (x == n - 1 && y == m - 1)
//                 return dp[x][y] = 1;

//             // If reach the corner of the matrix.
//             if (x == n - 1 || y == m - 1)
//                 result = 1;

//             // If value greater than below cell.
//             if (x + 1 < n && mat[x][y] < mat[x + 1][y])
//                 result = 1 + LIP(dp, mat, n, m, x + 1, y);

//             // If value greater than left cell.
//             if (y + 1 < m && mat[x][y] < mat[x][y + 1])
//                 result = Math.max(result, 1 + LIP(dp, mat, n, m, x, y + 1));

//             dp[x][y] = result;
//         }

//         return dp[x][y];
//     }

//     // Wrapper function
//     static int wrapper(int mat[][], int n, int m) {
//         int dp[][] = new int[n][m];
//         for (int i = 0; i < n; i++)
//             Arrays.fill(dp[i], -1);

//         return LIP(dp, mat, n, m, 0, 0);
//     }

//     /* Driver program to test above function */
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Reading dimensions of the matrix
//         System.out.print("Enter the number of rows: ");
//         int n = scanner.nextInt();
//         System.out.print("Enter the number of columns: ");
//         int m = scanner.nextInt();

//         int mat[][] = new int[n][m];

//         // Reading matrix elements
//         System.out.println("Enter the elements of the matrix:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 mat[i][j] = scanner.nextInt();
//             }
//         }

//         // Closing the scanner
//         scanner.close();

//         // Calling the wrapper function and printing the result
//         System.out.println("Length of the longest increasing path: " + wrapper(mat, n, m));
//     }
// }
