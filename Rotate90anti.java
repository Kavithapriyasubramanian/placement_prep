import java.util.*;
class Rotate90anti{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mat[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        rotate(mat,n);
        display(mat,n);
    }
    public static void display(int mat[][],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void rotate(int mat[][],int n){
        for(int i=0;i<n/2;i++){
            for(int j=i;j<n-1-i;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][n-1-i];
                mat[j][n-1-i]=mat[n-1-i][n-1-j];
                mat[n-1-i][n-1-j]=mat[n-1-j][i];
                mat[n-1-j][i]=temp;

            }
        }
    }
}