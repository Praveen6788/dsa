
import java.util.*;
public class search {
    public static void main(String[] args) {
        String a ="aeiou";
        String b="praveen";

        char c[] =a.toCharArray();
        // System.out.println(Arrays.toString(c));
        // for(char e :c){
        //     System.out.println(e);
        // }

        for( char e :b.toCharArray()){
            if(Arrays.binarySearch(c, e)>-1){
                System.out.println(e);
            }
        }


    }
}
