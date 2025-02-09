import java.util.*;


public class methods {

    static String mymethod( String fname){
        return ("hi"+" "+fname);
        
        
        
        
    }
    static void mymethod(int age){
        System.out.println("hi"+" "+age);
        
        
        
        
    }


    

    static void iseligible(int age,String name){
        if(age >18){
            System.out.println(name+"is eligible to vote");
        }
        else{
            System.out.println(name+"is not eligible to vote");
        }
    }

    public static void main(String[] args) {
        
        System.out.println(mymethod("praveen"));
        mymethod(19);
        mymethod("kishore");



        iseligible(18, "praveen");
    }
}
