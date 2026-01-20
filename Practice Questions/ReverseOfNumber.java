
import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int reversedNumber = 0;

        while (number != 0) {
            int lastDigit = number % 10;//to get last digit
            reversedNumber = reversedNumber * 10 + lastDigit;//to append digit
            number /= 10;//to remove last digit
        }

        System.out.println("Reversed Number: " + reversedNumber);
    }
    /**
     * Sample Input:
     * number = 12345
     * Sample Output:
     * Reversed Number: 54321
     * Explanation:
     * The program reverses the digits of the given number using a while loop and prints the result.
     */
}
