public class FloyedsTrianglePattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        int number = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
        /**
         * Output:
         * 1
         * 2 3
         * 4 5 6
         * 7 8 9 10
         * 11 12 13 14 15
         * 
         * Explanation:
         * The outer loop runs from 1 to n (number of rows).
         * The inner loop runs from 1 to i (current row number).
         * In each iteration of the inner loop, we print the current number and then increment it by 1.
         * After completing each row, we move to the next line.
         * This results in a Floyd's Triangle pattern where numbers are printed in a triangular format.
         */
    }
}
