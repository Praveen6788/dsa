package dsa;

import java.util.*;

public class mergesort {

    static void merging(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> temp = new ArrayList<>();

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // Copy the sorted elements back into the original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    static void merge(int[] arr, int low, int high) {
        if (low < high) { // base condition should be low < high
            int mid = (low + high) / 2;

            merge(arr, low, mid);
            merge(arr, mid + 1, high); // mid + 1 to cover the right half
            merging(arr, low, mid, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 4, 3, 2 };

        int low = 0; // Fix: should be 0
        int high = arr.length - 1; // Fix: should be arr.length - 1

        merge(arr, low, high);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
