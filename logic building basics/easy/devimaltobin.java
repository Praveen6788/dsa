public class devimaltobin {
    public static void main(String[] args) {
        int n=12;
        // System.out.println(Integer.toBinaryString(n)); 
        StringBuilder a = new StringBuilder();

        while (n>0) {
            int bit =n%2;

            a.append(String.valueOf(bit));
            n/=2;

            
        }
        System.out.println(a.reverse().toString());



    }
}
