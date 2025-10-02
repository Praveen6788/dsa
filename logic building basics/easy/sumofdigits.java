public class sumofdigits{
    // public static void main(String[] args) {
    //     int n =687;
    //     String a = String.valueOf(n);

    //     int sum=0;
    //     for(char e : a.toCharArray()){
    //         String b = Character.toString(e);
    //         int w =Integer.parseInt(b);
    //         sum+=w;
    //     }
    //     System.out.println(sum);
    // }
    public static void main(String[] args) {
        int n=687;
        int sum=0;
        while(n>0){
        sum+=n%10;
        n/=10;
        }
        System.out.println(sum);
        
    }
    
}