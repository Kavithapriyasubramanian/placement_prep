import java.util.*;
public class Commoninthree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        int arr1[]=new int[size];
        int arr2[]=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            //System.out.print(arr[i]+" ");

        }

        for(int j=0;j<size;j++){
            arr1[j]=sc.nextInt();
             //System.out.print(arr1[j]+" ");
        }

        for(int k=0;k<size;k++){
            arr2[k]=sc.nextInt();
            // System.out.print(arr2[k]+" ");
        }

        int i=0,j=0,k=0;


        while(i<arr.length && j<arr1.length && k<arr2.length){
            if(arr[i]==arr1[j]&& arr[i]==arr2[k]){
                System.out.print(arr1[i]+" ");
            
            i++;
            j++;
            k++;
            }


            else if(arr[i]<arr1[j] && arr[i]<arr2[k]){
                i++;
            }

            else if(arr1[j]<arr[i] && arr1[j]<arr2[k]){
                j++;
            }

            else if(arr2[k]<arr[i] && arr2[k]<arr1[i]){
                k++;
            }

        }


    }

    
}
