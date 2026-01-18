
import java.util.Scanner;

public class CalculatorSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter Operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                 // Addition
                System.out.println("Addition: " + (num1 + num2));
                break;
            case '-':
                // Subtraction
                System.out.println("Subtraction: " + (num1 - num2));
                break;
            case '*':
                // Multiplication
                System.out.println("Multiplication: " + (num1 * num2));
                break;
            case '/':
                // Division
                if (num2 != 0) {
                    System.out.println("Division: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case '%':
                // Modulus
                System.out.println("Modulus: " + (num1 % num2));
                break;
            default:
                // Invalid operator
                System.out.println("Invalid operator!");
                break;
        }
        
    }
}
