public class ArithmaticOperators {
    public static void main(String[] args) {

      System.out.println("Binary operators:-");
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

        System.out.println("\nUnary operators:-");
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

        System.out.println("\nTernary operator:-");
        /*ternary Operator */
        int num1 = 10;
        int num2 = 20;

        // Ternary Operator
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("Maximum: " + max);

        /**
         * Note:
         * The ternary operator is a shorthand for an if-else statement.
         * It takes three operands: a condition, a result for true, and a result for false.
         * Syntax: condition ? expression1 : expression2;
         * If the condition is true, expression1 is evaluated and returned; otherwise, expression2 is evaluated and returned.
         */

    }
}
