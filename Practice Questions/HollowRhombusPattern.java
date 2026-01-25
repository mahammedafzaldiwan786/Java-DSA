public class HollowRhombusPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars and spaces for hollow effect
            for (int k = 1; k <= n; k++) {
                if (i == 1 || i == n || k == 1 || k == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        /**
         * Output:
         *     *****
         *    *   *
         *   *   *
         *  *   *
         * *****
         * 
         * Explanation:
         * The outer loop runs from 1 to n (number of rows).
         * The first inner loop prints leading spaces to create the rhombus shape.
         * The second inner loop prints stars at the borders (first and last rows, first and last columns) and spaces in between to create a hollow effect.
         * After completing each row, we move to the next line.
         * This results in a hollow rhombus pattern made of stars.
         */
    }
}
