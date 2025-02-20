
public class quicksort {

    static void quick(int arr[], int low, int high) {
        if (low < high) {

            int pivotindex = partition(arr, low, high);

            quick(arr, low, pivotindex - 1);
            quick(arr, pivotindex + 1, high);

        }
    }

    static void partition(int[] arr, int low, int high) {

        int pivot = low;
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= high && arr[i] < pivot)
                ;
            while (i <= high && arr[i] < pivot)
                ;

            if (i < j) {
                swap(arr, i, j);
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };

    }

}
