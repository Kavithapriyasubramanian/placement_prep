import java.util.*;
public class Ceiling{
    public static int ceil(int[] arr,int key){
        int size=arr.length;
        int left=0;
        int right=size-1;

        while(left<right){
            int mid=left+(right-left)/2;

            if(key==arr[mid]){
                return arr[mid];
            }

            else if(arr[mid]>key){
                //left=mid+1;
                right=mid-1;
            }
            else{
                left=mid+1;
            }

        }
        if(left<arr.length){
        return arr[left];
        }
        else{
            return -1;
        }
    }



        public static int floor(int[] arr,int key){
        int size=arr.length;
        int left=0;
        int right=size-1;

        while(left<right){
            int mid=left+(right-left)/2;

            if(key==arr[mid]){
                return arr[mid];
            }

            else if(arr[mid]>key){
                //left=mid+1;
                right=mid-1;
            }
            else{
                left=mid+1;
            }

        }
        if(left<arr.length){
        return arr[right];
        }
        else{
            return -1;
        }
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int size=sc.nextInt();

        int[] arr=new int[size];

        System.out.println("Enter the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int key=sc.nextInt();


        System.out.println("Ceil");


        System.out.println(ceil(arr,key));

        System.out.println(" Floor");
        System.out.println(floor(arr,key));

    }



    
}