import java.util.*;
public class Commonelement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] matrix=new int[n][m];

        for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
        matrix[i][j]=sc.nextInt();
        }
    }

    int common=findcommon(matrix,n,m);
    System.out.println("common element:"+common);
    sc.close();
}


public static int findcommon(int[][] matrix,int n,int m){
    for(int j=0;j<m;j++){
    int current=matrix[0][j];
    boolean isCommon=true;

    for(int i=0;i<n;i++){
        if(containsElement(matrix[i],current==-1)){
            isCommon=false;
            break;
        }
    }

    if(isCommon){
        return current;
    }
}
return -1;
}


public static int containsElement(int[] n,int target){
    for(int num:n){
        if(num==target){
            return -1;
        }
        else{
            return -1;
        }
    }
    return -1;
}
}