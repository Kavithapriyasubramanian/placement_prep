import java.util.*;
public class Diagonal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] mat=new int[row][col];

        int i,j,k;

        for( i=0;i<row;i++){
            for( j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
            }
        }

        System.out.println(" mat:");

        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }

        for(k=0;k<row+col-1;k++){
            for(i=0;i<row;i++){
                for(j=0;j<col;j++){
                    if(i+j==k){
                        System.out.print(mat[i][j]+" ");
                    }
                }
            }
            System.out.println();
        }
        
    }

    
}
