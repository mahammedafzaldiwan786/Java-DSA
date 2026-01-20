
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <=number-1; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        /**
         * Expected Output:
         * Enter a number: 7
         * 7 is a prime number.
         * Explanation:
         * The program prompts the user to enter a number.
         * It checks if the number is less than or equal to 1; if so, it sets isPrime to false since prime numbers are greater than 1.
         * It then iterates from 2 to number-1, checking if the number is divisible by any of these values. If it finds a divisor, it sets isPrime to false and breaks out of the loop.
         * Finally, it prints whether the number is prime or not based on the value of is Prime.
         */
    }
}
