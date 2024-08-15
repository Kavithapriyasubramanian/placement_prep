import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] arr1 = Arrays.copyOf(arr,n);
        Arrays.sort(arr1);
        System.out.print("Sorted Array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]%2 != 0){
                list.add(arr[i]);
            }
        }
        Collections.sort(list);
        System.out.println("");
        System.out.print("Sorted indices : ");
        for(int num : list){
            for(int i=0;i<n;i++){
                if(num == arr[i]){
                    System.out.print(i+" ");
                }
            }
        }
    }
}