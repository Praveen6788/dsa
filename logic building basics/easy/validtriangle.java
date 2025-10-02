public class validtriangle {
    public static void main(String[] args) {
        int a=7;
        int b=10;
        int c=5;

        if((a+b)>c || (a+c)>b || (b+c)>a){
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }
    }
}
