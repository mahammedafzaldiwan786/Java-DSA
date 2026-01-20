
import java.util.Scanner;

public class BreakKeywordQuestion {
    public static void main(String[] args) {
        // Question: Keep entring numbers until the user enters a negative number.
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            if (number < 0) {
                break;
            }else{
                System.out.println("You entered: " + number);
            }
    }
    /**
     * Expected Output:
     * Enter a number: 5
     * You entered: 5
     * Enter a number: 10
     * You entered: 10
     * Enter a number: -3
     * (Program terminates)
     * Explanation:
     * The program continuously prompts the user to enter a number.
     * If the user enters a negative number, the break statement is executed, terminating the loop and ending the program.
     * If the user enters a non-negative number, it prints the number and continues the loop.
     */
    }
}
