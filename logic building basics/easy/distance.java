public class distance {
    public static void main(String[] args) {
        int x1=3;
        int x2=7;
        int y1=4;
        int y2=7;


        int a =(int)Math.abs(x2-x1);
        int b =(int)Math.abs(y2-y1);
        int z =(int) ((int) Math.pow(a, 2)+Math.pow(b,2));
        System.out.println(Math.sqrt(z));
    }
}
