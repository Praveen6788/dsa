public class primenumber {
    public static void main(String[] args) {
        int a =15;
        boolean b =true;
        if(a<1){
            System.out.println("not prime");
        }
        for(int i=2;i<Math.sqrt(a);i++){
            if(a%i==0){
                b=false;
            }

        }
        if(b){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }

    }
}
