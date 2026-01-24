public class HollowRectanglePattern {

    public static void main(String[] args) {
        int rows = 5;
        int cols = 10;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        /**
         * Expected Output:
         * **********
         * *        *
         * *        *
         * *        *
         * **********
         * 
         * Explanation:
         * The outer loop iterates through each row, while the inner loop iterates through each column.
         * The condition checks if the current position is on the border of the rectangle (first or last row, or first or last column) to print an asterisk ("*").
         *  If it's not on the border, it prints a space (" ").
         * 
         */
    }
}