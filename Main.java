import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        majority(arr);
    }
    public static void majority(int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i]+1));
            } else{
                hm.put(arr[i], 1);
            }
        }
        for(int key : hm.keySet()){
            if(hm.get(key) > n/3){
                System.out.print(key+" ");
            }
        }
    }
}