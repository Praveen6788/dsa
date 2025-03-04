import java.sql.Array;
import java.util.Arrays;
import java.lang.Math;

public class removedupl {

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int j = 0;
        int a = nums.length - 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[j] != nums[i]) {
                nums[j + 1] = nums[i];
                j++;
            }

        }
        int c[] = Arrays.copyOfRange(nums, 0, j + 1);
        System.out.println(Arrays.toString(nums));

    }
}
