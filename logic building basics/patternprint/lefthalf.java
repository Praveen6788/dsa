public class lefthalf {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            for(int j=0;j<=5;j++){
                if(j<5-i){
                    System.out.printf(" ");
                }
                else{
                    System.out.printf("*");
                }
            }
            System.out.println();
        }
    }
}
