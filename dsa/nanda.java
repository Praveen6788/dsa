import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class nanda {
    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int target = 0;
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();

        int i = 1;

        int j = arr.length - 1;
        for (int k = 0; k < arr.length - 1; k++) {

            int l = target - (arr[k] + arr[i]);
            if (arr[j] == l) {
                a.add(new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[k])));
                System.out.println(a);

            }
            if (j == i) {
                i++;
                j = arr.length;
            } else {
                j--;
            }

        }

    }
}
