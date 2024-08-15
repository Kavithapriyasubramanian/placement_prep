import java.util.*;
public class Maxrep {
    static int maxRepeating(int arr[],int size,int k){

        

        for(int i=0;i<size;i++){
            arr[(arr[i]%k)]+=k;
        }

        int max=arr[0],result=0;
        for(int i=1;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
                result=i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("size:");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println("entering:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("rep");
        int res=maxRepeating(arr, size, size);
        System.out.println(res);
    }
    
}
