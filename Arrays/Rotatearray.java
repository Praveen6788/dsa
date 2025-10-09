import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rotatearray {
    public static void main(String[] args) {
        Integer []nums = {1,2,3,4,5,6,7};
        int k = 3;
        int n = nums.length;

        k=k%n;
        System.out.println(k);

        Integer[] a =Arrays.copyOfRange(nums, k+1,n);
        Integer [] b =Arrays.copyOfRange(nums, 0,k+1);

        List<Integer> ans = new ArrayList<>();
        List<Integer> s = new ArrayList<>(Arrays.asList(a));
        List<Integer> t = new ArrayList<>(Arrays.asList(b));
    
        ans.addAll(s);
        ans.addAll(t);
        System.out.println(ans);

     }
}
