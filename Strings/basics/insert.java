import java.util.*;

public class insert {
    public static void main(String[] args) {
    String a ="    geeks.for.geeks    ";
    String b = "asdsad";
    // char []b =a.toCharArray();

    StringBuffer c = new StringBuffer(a);
   


    char d ='k';

    for(int i=0;i<a.length();i++){
        if(c.charAt(i)==d){
            System.out.println(i);
            // c.insert(i, "jj");
            // c.setCharAt(i, 'v');
            


        }
    }
     System.out.println(Arrays.toString(c.toString().split("\\.")));


     a =a.replace("g", "");
     System.out.println(a.trim());

     System.out.println(a.trim()+b+c);
    
        
    }
    
}
