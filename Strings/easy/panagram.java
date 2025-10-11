import java.util.*;

public class panagram {
    public static void main(String[] args) {
        String [] there = new String[26];
        Arrays.fill(there,"false");
        System.out.println(Arrays.toString(there));

        String s ="The quick brown fox jumps over the lazy dog" ;

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)==' '){
                continue;
            }
            else{
                char f=s.charAt(i);
                int g =(int) Math.abs('a'- Character.toLowerCase(f)) ;
                there[g]="true";
            }
        }
         System.out.println(Arrays.toString(there));

        System.out.println(Arrays.toString(there).contains("false"));
    }
}
