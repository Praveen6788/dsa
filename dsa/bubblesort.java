
import java.lang.reflect.Array;
import java.util.Arrays;

public class bubblesort {
    public static void main(String args[]) {
        int arr[] = { 5, 4, 3, 2, 1 };

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - i - 1; j++) {

                if (arr[i] > arr[j]) {
                    int k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
