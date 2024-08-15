import java.util.*;
public class Merging {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size1=sc.nextInt();
        int size2=sc.nextInt();
        int size3=size1+size2;

        int arr1[]=new int[size1];
        int arr2[]=new int[size2];
        int arr3[]=new int[size3];


        for(int i=0;i<size1;i++){
            arr1[i]=sc.nextInt();
        }

        for(int j=0;j<size2;j++){
            arr2[j]=sc.nextInt();
        }

        
        merge(arr1,arr2,arr3,size1,size2,size3);

        System.out.println("Merged array:");

        for(int k=0;k<size3;k++){
            //arr3[k]=sc.nextInt();
            System.out.print(arr3[k]+" ");
        }
    

    //System.out.println(merge);
    }

    public static void merge(int arr1[],int arr2[],int arr3[],int size1,int size2,int size3){

        int i=0;
        int j=0;
        int k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else{
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }

        while(i<arr1.length){
            arr3[k]=arr1[i];
            i++;
            k++;
        }

        while(j<arr2.length){
            arr3[k]=arr2[j];
            j++;
            k++;
        }
    }

        //return arr3;
}


    

    

