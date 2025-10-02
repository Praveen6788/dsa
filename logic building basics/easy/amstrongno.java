public class amstrongno {
    public static void main(String[] args) {
        int n = 153;
        int b=n;
        String a = String.valueOf(n);
        int l = a.length();
        int sum = 0;
        while (n > 0) {
            int k = n % 10;
            System.out.println(k);
            sum += (int) Math.pow(k, l);
            n /= 10;

        }
        System.out.println(sum);
        if(b==sum){
            System.out.println("amstrong number");
        }
        else{
            System.out.println("not");
        }

    }
}
