
import java.util.ArrayList;
import java.util.Arrays;

public class practice {
    static void mergesort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            mergesort(arr, low, mid);
            mergesort(arr, mid + 1, high);

            merge(arr, low, mid, high);
        }
    }

    static void merge(int arr[], int low, int mid, int high) {
        int left = low;
        int right = mid + 1;

        ArrayList<Integer> arr2 = new ArrayList<>();

        // Merging the two sorted halves
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                arr2.add(arr[left]);
                left++;
            } else {
                arr2.add(arr[right]);
                right++;
            }
        }

        // Copy remaining elements from the left subarray
        while (left <= mid) {
            arr2.add(arr[left]);
            left++;
        }

        // Copy remaining elements from the right subarray
        while (right <= high) {
            arr2.add(arr[right]);
            right++;
        }

        // Copy merged elements back to original array
        for (int i = low; i <= high; i++) {
            arr[i] = arr2.get(i - low);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 4, 3, 2 };

        int low = 0;
        int high = arr.length - 1;

        mergesort(arr, low, high);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
