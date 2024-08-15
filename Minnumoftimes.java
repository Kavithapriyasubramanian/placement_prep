import java.util.*;
class Minnumoftimes{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int smallest=i;
            for(int j=i+1;j<n;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
        }
       /*  for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }*/
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        int mergesize=0;
        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            mergesize=mergesize+(a+b);
            pq.add(a+b);
        }
        System.out.println(mergesize);
        

    }
}