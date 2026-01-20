
import java.util.Scanner;

public class SumOfFirstnNaturalNumbers {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
    /**
     * Sample Input:
     * n = 10
     * Sample Output:
     * The sum of the first 10 natural numbers is: 55
     * Explanation:
     * The program calculates the sum of the first n natural numbers using a loop and prints the result.
     */
}
