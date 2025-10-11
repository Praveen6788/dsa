import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class twosum {
    public static void main(String[] args) {
        Integer [] numbers={2,7,11,15};
        List<Integer> a = new ArrayList<>(Arrays.asList(numbers));
        int target =9;

        for(int i=0;i<numbers.length;i++){
            int remain = target-numbers[i];
            if(a.contains(remain)){
                int b =a.indexOf(remain)+1;
                System.out.println(i+1+""+b);
            }
            }
        }
}
