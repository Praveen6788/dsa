import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class zeroatoend {

    static void moveend(int[] nums) {

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
                System.out.println(nums[j]);

            }

        }
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
        System.out.println(Arrays.toString(nums));

    }

    public static String opmove(int[] nums) {
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) {
            return Arrays.toString(nums);

        }
        int k;

        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                k = nums[j];
                nums[j] = nums[i];
                nums[i] = k;

                j++;

            }
        }
        return Arrays.toString(nums);

    }

    public static void main(String[] args) {

        int[] nums = { 0, 1, 0, 3, 12 };

        // moveend(nums);
        String k = opmove(nums);
        System.out.println(k);

    }
}
