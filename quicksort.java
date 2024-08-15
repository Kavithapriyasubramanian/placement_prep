/*import java.util.*;
public class quicksort{

    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }

    public static void quick(int arr[],int low,int high){
        if(low<high){
            int pivotindex=partition(arr,low,high);

            quick(arr, low, pivotindex-1);
            quick(arr, pivotindex+1, high);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Entering element in the array:");
        

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        quick(arr,0,size-1);
        
        System.out.println("sorted array:");

        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}*/

import java.util.*;
public class quicksort{
    public static void partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;

                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        pivot=temp;
        return i;

    }
    public static void quick(int arr[],int low,int high){
        int pivotindex=partition(arr,low,high);

        quick(arr, low, pivotindex);
        quick(arr, pivotindex+1, high);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size
        
    }
}



