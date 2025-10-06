public class hollosquare {
    public static void main(String[] args) {
        for(int i=1;i<5;i++){
            for(int j=1;j<5;j++){
                if(i==1){
                    System.out.printf("*");
                }
                else if(i==5-1){
                    System.out.printf("*");
                }
                
                else if((j>1)&&(j<5-1)){
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


// for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 // Print stars on the boundary
//                 if (i == 1 || i == n || j == 1 || j == n) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }