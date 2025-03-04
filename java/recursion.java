public class recursion {
    int count = 0; // Instance variable

    Integer factorial(int n) { // Correct return type
        if (n == 0 || n == 1) {
            // Base case to stop recursion

            return n;

        }

        return n * factorial(n - 1);// Recursive call
    }

    void count(int n) {

        if (n == 0) {
            return;
        }

        count(n - 1);
        System.out.print(n + " ");

    }

    public static void main(String[] args) {
        recursion obj = new recursion(); // Create an instance
        int k = obj.factorial(5); // Call the method
        System.out.println(k);

        obj.count(10);
    }
}
