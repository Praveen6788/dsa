public class nthtermofap {
    public static void main(String[] args) {
        int a =1;
        int b=2;
        int diff = b-a;
        int i=a;
        for(int n=0;n<10;n++){
            System.out.println(i);
            i+=diff;
        }
        int term=10;
        int ans = a+(term-1)*diff;
        System.out.println(ans);
    

    }
}
