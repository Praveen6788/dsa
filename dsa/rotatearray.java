import java.util.ArrayList;

public class rotatearray {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        int k = 3;
        for (int i = 0; i < k; i++) {
            int a = nums.removeLast();
            nums.addFirst(a);
        }
        System.out.println(nums);
    }
}
