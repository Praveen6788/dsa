public class countvalidstrs {
    public static void main(String[] args) {
        String a ="00100101";
        int count =0;

        for(int i=0;i<=a.length();i++)
        {
            for(int j=i+1;j<=a.length();j++){
               String c= a.substring(i, j);
               System.out.println(c);
               if(c.startsWith("1") && c.endsWith("1") && c.length()>1){
                
                count++;
               }

            }
             
        }   
        System.out.println(count);
    }
}
