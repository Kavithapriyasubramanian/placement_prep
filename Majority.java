import java.util.*;
public class Majority {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }


        int maxcount=0;
        int index=-1;

        for(int i=0;i<size;i++){
            int count=0;
            for(int j=0;j<size;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }

            if(count>maxcount){
                maxcount=count;
                index=i;
            }
        }

        if(maxcount>size/2){
            System.out.println("majority: "+arr[index]);
        }
        else{
            System.out.println("no majority element");
        }

    }
    
}
