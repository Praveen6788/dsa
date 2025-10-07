import java.util.*;
public class triangle {
    public static void main(String[] args) {
        int n =5;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                char a = (char) ('a'+j);
    
                System.out.printf( "%c",a);
            }
            System.out.println();
        }
    }
}
