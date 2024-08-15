import java.util.*;

public class CountDistinct {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        count(arr, n, k);
    }

    public static int wind(int win[], int k) {
        Set<Integer> distinctElements = new HashSet<>();
        for (int i = 0; i < k; i++){
            distinctElements.add(win[i]);
        }
        return distinctElements.size();
    }

    public static void count(int arr[], int n, int k) {
        for (int i = 0; i <= n - k; i++) {
            int[] win = new int[k];
            for (int j = 0; j < k; j++) {
                win[j] = arr[i + j];
            }
            System.out.println(wind(win, k));
        }   
    }
}
