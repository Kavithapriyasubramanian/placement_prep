import java.util.*;

public class Searchatmostk {

    public static int searchArray(int[] arr, int k, int target) {
        int n = arr.length;
        int i = 0;

        while (i < n) {
            if (arr[i] == target) {
                return i; // Return the index when the target is found
            }

            // Move to the next window
            i = i + Math.max(1, Math.abs(arr[i] - target) / k);
        }

        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int target = sc.nextInt();

        int index = searchArray(arr, k, target);

        if (index != -1) {
            System.out.println(target + " found in the array at index " + index + ".");
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
}
