import java.util.*;
class Diagonalsum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mat[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println(sums(mat));
    }
    public static int sums(int mat[][]){
        int n=mat.length;
        int d1=0;
        int d2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    d1=d1+mat[i][j];
                }
                if(i==n-j-1){
                    d2=d2+mat[i][j];
                }
            }
        }
        return Math.abs(d1-d2);
    }
}