import java.util.*;
public class cuberoot {
    public static void main(String[] args) {
        int n=35;
        int count=0;

        for(int i=1;i<=Math.cbrt(n);i++){
            int cbrt = i*i*i;

            int diff = n - cbrt;

            int dcbrt = (int) Math.cbrt(diff);
            
            if (dcbrt*dcbrt*dcbrt==diff){
                count++;

            }


        }
        System.out.println(count);
    }
    
}
