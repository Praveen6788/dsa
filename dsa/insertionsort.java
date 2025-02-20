
import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {

        int arr[] = { 12, 3, 434, 423, 2, 23 };

        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int k = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = k;

                j--;

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
