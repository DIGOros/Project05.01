public class Main {

    public static void main(String[] args) {
        // Call method with no arguments and no return value
        greet();

        // Call method with different argument types and return value handling
        int sum = add(5, 7);
        System.out.println("Sum: " + sum);

        double product = multiply(3.5, 2.0);
        System.out.println("Product: " + product);

        String fullName = concatenateNames("John", "Doe");
        System.out.println("Full Name: " + fullName);
    }

    // Method with no arguments and no return value
    public static void greet() {
        System.out.println("Hello, World!");
    }

    // Method with different argument types (int) and return value (int)
    public static int add(int a, int b) {
        return a + b;
    }

    // Method with different argument types (double) and return value (double)
    public static double multiply(double x, double y) {
        return x * y;
    }

    // Method with different argument types (String) and return value (String)
    public static String concatenateNames(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
