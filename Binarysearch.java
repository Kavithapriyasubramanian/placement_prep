import java.util.Scanner;

public class Binarysearch {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found, return the index
            } else if (arr[mid] < target) {
                left = mid + 1; // Target is in the right half
            } else {
                right = mid - 1; // Target is in the left half
            }
        }

        return -1; // Target not found in the array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target element to search: ");
        int target = sc.nextInt();

        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println(target + " found in the array at index " + index + ".");
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
}
