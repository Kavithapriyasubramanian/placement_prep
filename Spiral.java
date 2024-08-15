/*import java.util.*;

public class Spiral {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] matrix=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }


        int rowBegin=0;
        int colBegin=0;
        int rowEnd=n-1;
        int colEnd=m-1;

        while(rowBegin<=rowEnd && colBegin<=colEnd){

            for(int col=colBegin;col<=colEnd;col++){
            System.out.print(matrix[rowBegin][col]+" ");
            }
            rowBegin++;

            for(int row=rowBegin;row<=rowEnd;row++){
                System.out.print(matrix[row][colEnd]+ " ");
            }
            colEnd--;

            for(int col=colEnd;col>=colBegin;col--){
                System.out.print(matrix[rowEnd][col]+" ");
            }
            rowEnd--;

            for(int row=rowEnd;row>=rowBegin;row--){
                System.out.print(matrix[row][colBegin]+ " ");
            }
            colBegin++;
            System.out.println();

        }    
}
}*/
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
        if(m==0 || n==0){
            System.out.println("0");
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(m==0 || n==0){
            System.out.println(mat[i][j]+" ");
        }
            }
        }
        int colbegin=0;
        int colend=m-1;
        int rowbegin=0;
        int rowend=n-1;
        
        
        while(colbegin<=colend && rowbegin<=rowend){
            for(int i=colbegin;i<=colend;i++){
                System.out.print(mat[rowbegin][i]+" ");
            }
            rowbegin++;
            for(int i=rowbegin;i<=rowend;i++){
                System.out.print(mat[i][colend]+" ");
            }
            colend--;
if(rowbegin<=rowend){
            for(int i=colend;i>=colbegin;i--){
                System.out.print(mat[rowend][i]+" ");
            }
            rowend--;
}
if(colbegin<=colend){
            for(int i=rowend;i>=rowbegin;i--){
                System.out.print(mat[i][colbegin]+" ");
            }
            colbegin++;  
        }
}
    }
}
