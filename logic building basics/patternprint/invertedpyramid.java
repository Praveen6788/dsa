public class invertedpyramid {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=2*5-1;j++){
                if((j>=i) && (j<=2*5-i)){
                    System.out.printf("*");
                }
                else{
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }
}
