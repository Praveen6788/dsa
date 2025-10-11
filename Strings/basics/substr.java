

public class substr {
    public static void main(String[] args) {
        String a="praveen";
        // StringBuilder a = new StringBuilder()


        for(int i=0;i<=a.length();i++){
            for(int j=i+1;j<=a.length();j++){
                // System.out.println(i+" "+j);
                String c =a.substring(i, j);
                System.out.println(c);
            }
        }
    }
    
}
