import java.util.*;
public class Zero {

    //public static boolean 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] mat=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
            }
        }

        boolean firstRow=false,firstCol=false;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==0){
                    if(i==0) 
                    firstRow=true;
                    if(j==0) 
                    firstCol=true;
                    mat[0][j]=0;
                    mat[i][0]=0;
                    
                }
            }
        }


                
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            if(mat[0][j]==0 || mat[i][0]==0)
            mat[i][j]=0;
            }
        }



            if(firstRow){
            for(int j=0;j<col;j++){
            mat[0][j]=0;
            }
        }

                
            
            if(firstCol){
            for(int i=0;i<row;i++){
            mat[i][0]=0;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

                
            
        


    }
    
}
