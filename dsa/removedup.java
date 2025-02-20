import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

// BRUTE FORCE
public class removedup {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        int c[] = { 1, 2, 2, 3, 3, 4, 4, 5, 5 };
        b.add(5);
        b.add(5);
        b.add(3);
        b.add(4);
        b.add(6);
        b.add(3);
        System.out.println(b);

        for (int i : b) {
            a.add(i);
        }

        System.out.println(a);

        int i = 0;
        int k;

        for (int j = 1; j < c.length; j++) {
            if (c[i] != c[j]) {
                c[i + 1] = c[j];
                i++;

            }

        }
        int[] d = Arrays.copyOfRange(c, 0, i + 1);
        System.out.println(Arrays.toString(d));

    }
}
