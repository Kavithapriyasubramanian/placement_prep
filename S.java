import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int mat[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               mat[i][j]=sc.nextInt();
            }
        }
        System.out.println(sol(n,m,mat));
    }
    public static int sol(int n,int m,int mat[][]){
        int count=0;
        if(n==0){
            return 0;
        }
        for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(mat[i][j]==1){
                        count++;
                        mark(i,j,mat);
                    }
                }
            }
        return count;
    }
    public static void mark(int row,int col,int mat){
        if(row<0 || row>=mat.length ||col<0 ||col>=mat[0].length || mat[row][col]==0){
            return;
        }
        mat[row][col]=0;
        mark(row-1,col-1,mat);
        mark(row+1,col+1,mat);
        mark(row-1,col+1,mat);
        mark(row+1,col-1,mat);
        mark(row,col+1,mat);
        mark(row,col-1,mat);
        mark(row+1,col,mat);
        mark(row-1,col,mat);
       // mark(n+1,m-1,mat);

    }
}