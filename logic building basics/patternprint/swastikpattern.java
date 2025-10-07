public class swastikpattern {
    public static void main(String[] args) {
        int n=7;
        int m=7;
        int k=7/2;
        System.out.println(k);

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 && i<k ){
                    System.out.printf("*");
                }
                else if(j==k || j>k && i==0 || i==k){
                    System.out.printf("*");
                }
                else if(i==n-1 && (j<k) ||   (j==n-1) && (i>k)){
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
