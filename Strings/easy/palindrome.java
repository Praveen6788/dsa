public class palindrome {
    public static void main(String[] args) {
        boolean a =true;
        String s ="awpwsa";

        int i=0;
        int j=s.length()-1;

        while (i<j) {
            if(s.charAt(i)!=s.charAt(j)){
                a=false;
            }
            i++;
            j--;
            
        }
        System.out.println(a);
        
    }
}
