
import java.util.Scanner;

public class ContinueKeywordQuestion {
    public static void main(String[] args) {
        // Question: Display all numbers given by the user except multiples of 10.
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number (or a negative number to exit): ");
            int number = sc.nextInt();
            if (number < 0) {
                break;
            }
            if (number % 10 == 0) {
                continue;
            }
            System.out.println("You entered: " + number);
    }
    /**
     * Expected Output:
     * Enter a number (or a negative number to exit): 5
     * You entered: 5
     * Enter a number (or a negative number to exit): 20
     * Enter a number (or a negative number to exit): 33
     * You entered: 33
     * Enter a number (or a negative number to exit): -1
     * (Program terminates)
     * Explanation:
     * The program continuously prompts the user to enter a number.
     * If the user enters a negative number, the break statement is executed, terminating the loop and ending the program.
     * If the user enters a multiple of 10, the continue statement is executed, skipping the print statement and continuing the loop.
     * If the user enters a non-negative number that is not a multiple of 10, it prints the number and continues the loop.
     */

    }    
}
