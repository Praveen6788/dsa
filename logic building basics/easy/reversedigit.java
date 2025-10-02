public class reversedigit {
    public static void main(String[] args) {
        int n=122;
        String revnum="";
        int c=0;
        int rec=0;
        // while (n>0) {
        //     int b=n%10;
        //     revnum+=String.valueOf(b);
        //     n/=10;

            
        // }
        // System.out.println(revnum);

        while(n>0){
            rec=rec*10+n%10;
            n/=10;
        }
        System.out.println(rec);
    }
}
