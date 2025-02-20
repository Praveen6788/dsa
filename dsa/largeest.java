import java.lang.Math;
import java.util.ArrayList;

public class largeest {
    public static void main(String[] args) {

        int arr[] = { 5, 23, 44, 223, 2323, 433, 4 };

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }

        }
        System.out.println(largest);

        int secound = -1;
        for (int i = 0; i < arr.length; i++) {
            if (secound < arr[i] && arr[i] < largest) {
                secound = arr[i];
            }

        }
        System.out.println(secound);

    }

}
