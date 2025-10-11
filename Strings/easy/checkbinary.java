

public class checkbinary {
    public static void main(String[] args) {
       String s = "01r010101010";
       boolean x =true;

       for(int i=0;i<s.length();i++){
        if(s.charAt(i)!='0'&& s.charAt(i)!='1'){
            x=false;
        }
       }

       
       System.out.println(x);
    }
}
