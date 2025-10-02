import java.util.*;

public class gcd {
    public static void main(String[] args) {
        int n=20;
        int m=28;
        // List<Integer> a =new ArrayList<>();
        // List<Integer> b =new ArrayList<>();
        // for(int i=1;i<=n;i++){
        //     if (n%i==0){
        //         a.add(i);

        //     }

        // }
        // for(int i=1;i<=m;i++){
        //     if (m%i==0){
        //         b.add(i);

        //     }

        // }
        // System.out.println(a);
        // System.out.println(b);

        // a.retainAll(b);

        // System.out.println(Collections.max(a));


        while(m!=0){
            int temp=m;
             m =n%m; 
             n=temp;

        }
        System.out.println(n);

    }
    
    

}
