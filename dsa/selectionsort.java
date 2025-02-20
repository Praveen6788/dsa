
import java.lang.Math;
import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 21, 1 };

        for (int i = 0; i < arr.length - 1; i++) {
            int m = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    m = j;

                }
            }
            int k = arr[i];
            arr[i] = arr[m];
            arr[m] = k;

        }
        System.out.println(Arrays.toString(arr));
    }

}
