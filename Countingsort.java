import java.util.*;
public class Countingsort {
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int arr[]=new int[size];

    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }

    /*countingsort(arr);
    System.out.println("sorted array");

    for(int value:arr){
        System.out.print(value+" ");
    }*/

    int max=findmax(arr);

    int count[]=new int[max+1];

    for(int value:arr){
        count[value]++;
    }

    for(int i=1;i<=max;i++){
        count[i]=count[i]+count[i-1];
    }

    int output[]=new int[size];

    for(int i=size-1;i>=0;i--){
        output[count[arr[i]]-1]=arr[i];
        count[arr[i]]--;
    }
    System.arraycopy(output, 0, arr, 0,size);

    System.out.println("Sorted array:");

    for(int value:arr){
        System.out.print(value+" ");
    }
    System.out.println();
}

public static int findmax(int[] arr) {
    int max = arr[0];
    for (int value : arr) {
        if (value > max) {
            max = value;
        }
    }
    return max;
}
}


    



    



