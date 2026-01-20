
import java.util.Scanner;

public class PrintNumber1ton {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt(); 
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
    /**
     * Sample Input:
     * Enter a positive integer: 5
     * Sample Output:
     * 1
     * 2
     * 3
     * 4
     * 5
     * Explanation:
     * The program takes a positive integer n as input and prints all integers from 1 to n, each on a new line.
     */
}