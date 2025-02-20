
import java.util.*;
import java.util.ArrayList;

public class prac {
    public static void main(String[] args) {
        String str = "cb34";

        ArrayList<Character> a = new ArrayList<Character>();

        String res = "";

        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                a.add(c);

            } else {
                if (a.size() > 0) {
                    a.removeLast();
                }

            }

        }
        if (a.isEmpty()) {
            System.out.println("");
        }
        for (char c : a) {
            res = res + c;

        }
        System.out.println(res);

    }
}
