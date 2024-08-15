// import java.util.*;
// public class Rotate {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=sc.nextInt();
//         int[][] matrix=new int[n][m];

//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 matrix[i][j]=sc.nextInt();
//             }
//         }

//         for(int i=0;i<(n+1)/2;i++){
//             for(int j=0;j<n/2;j++){
//                 int temp=matrix[n-1-j][i];

                
//                 matrix[n-1-j][i]=matrix[n-1-i][n-j-1];

//                 matrix[n-1-i][n-j-1]=matrix[j][n-1-i];

//                 matrix[j][n-1-i]=matrix[i][j];

//                 matrix[i][j]=temp;
//             }
//         }

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }

//     }
    
// }


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int mat[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int rotated[][]=rotate(mat);
        print(rotated);
    }
    public static int[][] rotate(int mat[][]){
        int n = mat.length;
        int m = mat[0].length;
        int rotated[][]=new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                rotated[j][n-1-i]=mat[i][j];
            }
        }
        return rotated;
    }
    public static void print(int mat[][]){
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mat[i][j]+" ");
            }
        }
    }
}