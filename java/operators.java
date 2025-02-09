import java.lang.Math;


public class operators {
    public static void main(String[] args) {
        int x=5;
        int a= 10-12;
        int b= 10/12;
        int c= 10%12;
           
        String cars[]={"asdas","asddas"};
               
        String first="praveen";
        String secound="grandhi";

        
        
        String txt = "Please locate where 'locate' occurs!"; 

        ++x;
        --x;
        System.out.println(x);

        if (a<0 &&  a!=0){
            System.out.println("hii");
        }

        System.out.println(txt.length());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.indexOf("locate"));


        System.out.println(first+" "+secound);
     
        System.out.println(first.concat(secound));

        System.out.println(cars.length);

        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        // Get the length of the array
        int length = ages.length;
        
        // Create a 'lowest age' variable and assign the first array element of ages to it
        int lowestAge = ages[0];

        for (int age : ages) {
            // Check if the current age is smaller than the current 'lowest age'
            if (lowestAge > age) {
              // If the smaller age is found, update 'lowest age' with that element
              lowestAge = age;
            }
        }

        System.out.println(lowestAge);
    }
    

    


}
