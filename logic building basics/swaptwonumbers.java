public class swaptwonumbers {
    // public static void main(String[] args) {
    //     int a =2;
    //     int b=3;
    //     int c =a;
    //     a=b;
    //     b=c;
    //     System.out.printf("%d %d",a,b);


    // }

    public static void main(String[] args) {
        int a=3;
        int b=4;
        a =a^b;
    
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);
    }
}
