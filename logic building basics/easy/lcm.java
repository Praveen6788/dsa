public class lcm {

    public  int gcd(int a,int b){
        while (b!=0) {
            int temp=b;
            b=a%b;
            a=temp;
            
        }
        return a;
    }
    public static void main(String[] args) {
        int a =12;
        int b=18;
        lcm c = new lcm();
       
        
        int g =c.gcd(a, b);
        int lcm = (a*b)/g; // formulae
        System.out.println(lcm);
    }
}
