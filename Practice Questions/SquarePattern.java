
import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square pattern: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    /**
     * Sample Input:
     * n = 5
     * Sample Output:
        *  *  *  *  *
        *  *  *  *  *
        *  *  *  *  *
        *  *  *  *  *
        *  *  *  *  *
     * Explanation:
     * The program prints a square pattern of asterisks (*) with the size specified by the input n.
     * Each row contains n asterisks, and there are n such rows.
     */
}