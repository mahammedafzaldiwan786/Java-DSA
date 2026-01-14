public class ArithmaticOperators {
    public static void main(String[] args) {

        /* Binary Operators */
        int a = 10;
        int b = 5;

        // Addition
        int addition = a + b;
        System.out.println("Addition: " + addition);

        // Subtraction
        int subtraction = a - b;
        System.out.println("Subtraction: " + subtraction);

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product);

        // Division
        int division = a / b;
        System.out.println("Division: " + division);

        // Modulus
        int remainder = a % b;
        System.out.println("Remainder: " + remainder);

        /* Unary Operators */
          int x = 10;
          int y = 5;

        // Unary Plus
        ++x; // Pre-Increment x by 1
        System.out.println("Unary Plus(Pre-Increment): " + x);
        x++; // Post-Increment x by 1
        System.out.println("Unary Plus(Post-Increment): " + x);

        // Unary Minus
        --y; // Pre-Decrement y by 1
        System.out.println("Unary Minus(Pre-Decrement): " + y);
        y--; // Post-Decrement y by 1
        System.out.println("Unary Minus(Post-Decrement): " + y);

    }
}
