public class Main {
    // Static method
    String name;

    public Main(String name){

      this.name=name;
      
    }

    // stattic methods cant aceess construcotr or instance variables
    static void myStaticMethod(String name) {
      System.out.println("hi"+name);
    }
  
    // Public method
    public void myPublicMethod() {
      System.out.println("Public methods must be called by creating objects"+name);
    }
  
    // Main method
    public static void main(String[] args) {
      // myStaticMethod("praveen"); // Call the static method
      // myPublicMethod(); This would compile an error
  
      Main myObj = new Main("PRAVEEN"); // Create an object of Main
      myObj.myPublicMethod(); // Call the public method on the object
    }
  }