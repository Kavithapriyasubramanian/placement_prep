import java.util.*;
public class Connectropes {
    public static int connect(int[] arr,int size){
        PriorityQueue<Integer>minHeap=new PriorityQueue<>();

        for(int i=0;i<size;i++){
            minHeap.add(arr[i]);
        }

        int mincost=0;

        while(minHeap.size()>1){
            int tempcost=minHeap.poll()+minHeap.poll();
            mincost=mincost+tempcost;

            minHeap.add(tempcost);
        }
        return mincost;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("size:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enetring:");
        
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("output:");


        System.out.println(Connectropes.connect(arr, size));
    }
    
}
