import java.util.*;
class Nextpermutation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=arr.length-2;
        while(arr[i]>arr[i+1]){
            i--;
        }
        if(i>=0){  
        int j=arr.length-1;
        while(arr[i]>arr[j]){
            j--;
        }
        swap(arr,i,j);
        }
        reverse(arr,i+1);
        for(int k=0;k<n;k++){
            System.out.println(arr[k]+" ");
        }
        
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void reverse(int arr[],int start){
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
    

