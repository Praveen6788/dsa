public class halfpyramid {
    public static void main(String[] args) {
        
        for(int i=0;i<=5;i++){
            for(int j=0;j<=i;j++){
                System.out.printf("*");

            }
            System.out.println();
        }
        for(int i=5;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.printf("*");

            }
            System.out.println();
        }
    }
}

// int n = 5; // height

//         for (int i = 0; i <= 2 * n; i++) {
//             int stars;

//             // First half (increasing stars)
//             if (i <= n) {
//                 stars = i;
//             } 
//             // Second half (decreasing stars)
//             else {
//                 stars = 2 * n - i;
//             }

//             // Print stars for this row
//             for (int j = 0; j <= stars; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }