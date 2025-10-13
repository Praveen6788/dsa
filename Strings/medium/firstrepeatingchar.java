import java.util.*;

public class firstrepeatingchar {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        Set<Character> a = new HashSet<>();

        for(char e : s.toCharArray()){
            if(a.contains(e)){
                System.out.println(e);
                break;
            }
            else{
                a.add(e);
            }
        }
    }
    
}
