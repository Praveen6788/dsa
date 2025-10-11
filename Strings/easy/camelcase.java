public class camelcase {
    public static void main(String[] args) {
        String a ="i got intern at geeksforgeeks";
        StringBuilder b = new StringBuilder(a);

        for(int i=0;i<a.length()-1;i++){
            if(a.charAt(i)==' '){
                char c =Character.toUpperCase(a.charAt(i+1));
                b.setCharAt(i+1, c);
                
            }
        }
       
        System.out.println(b.toString().replaceAll(" ",""));
    }
}
