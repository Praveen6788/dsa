public class diamond {
    public static void main(String[] args) {
        int n = 5; // size of half the diamond

        // Upper part
        // for (int i = 1; i <= n; i++) {
        //     // spaces
        //     for (int j = i; j < n; j++) {
        //         System.out.print(" ");
        //     }
        //     // stars
        //     for (int j = 1; j <= (2 * i - 1); j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // Lower part
        // for (int i = n - 1; i >= 1; i--) {
        //     // spaces
        //     for (int j = n; j > i; j--) {
        //         System.out.print(" ");
        //     }
        //     // stars
        //     for (int j = 1; j <= (2 * i - 1); j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        for(int i=1;i<=2*n;i++){
            
                if (i<=n){
                    for(int j =0;j<=2*n-1;j++){
                    if((j>n-i)&&(j<n+i)){
                        System.out.printf("*");

                    }
                    else{
                        System.out.printf(" ");
                    }}
                    System.out.println();

                }
                else{
                    int k=2*n-i+1;
                    for(int j =0;j<=2*n-1;j++){
                    if((j>n-k)&&(j<n+k)){
                        System.out.printf("*");

                    }
                    else{
                        System.out.printf(" ");
                    }}
                    System.out.println();
                }
            }
            System.out.println();
        }
}
