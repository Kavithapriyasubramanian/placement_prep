import java.util.*;

public class FIrstsmallestocurrence {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(occur(arr));
    }
    public static int occur(int arr[]){
        int n=arr.length;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
        }
        //Arrays.sort(set);

        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }

            }
            int temp=arr[smallest];
             arr[smallest]=arr[i];
             arr[i]=temp;
        }


        System.out.println(arr[0]);
        
    }
    
}
