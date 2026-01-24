public class InvertedRotatedHalfPyramid {
    
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /**
         * Expected Output:
         *     *
         *    **
         *   ***
         *  ****
         * *****
         * 
         * Explanation:
         * The outer loop iterates through each row from 1 to n.
         * The first inner loop prints the leading spaces required to align the asterisks to the right.
         * The second inner loop prints the asterisks for the current row.
         * This creates an inverted rotated half pyramid pattern.
         */
    }
}
