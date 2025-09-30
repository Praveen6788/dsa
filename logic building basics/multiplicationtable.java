import java.util.*;
public class multiplicationtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int a = sc.nextInt();
        for(int i =0;i<11;i++){
            System.out.println(a+" * "+i+" = "+a*i);
        }
    }
}
