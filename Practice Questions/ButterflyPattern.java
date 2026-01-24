public class ButterflyPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the butterfly pattern

        // Upper half of the butterfly
        for (int i = 1; i <= n; i++) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // Right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower half of the butterfly
        for (int i = n; i >= 1; i--) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // Right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /**
         * Expected Output:
        *                 * 
        * *             * *
        * * *         * * *
        * * * *     * * * *
        * * * * * * * * * *
        * * * * * * * * * *
        * * * *     * * * *
        * * *         * * *
        * *             * *
        *                 *
        
        * Explanation:
        * The pattern consists of two symmetrical halves (upper and lower).
        * Each half has two wings made of asterisks (*) and a central space.
        * The number of asterisks increases from 1 to n in the upper half and decreases from n to 1 in the lower half.
        * The spaces in the middle decrease as the number of asterisks increases, creating the butterfly effect.
        * Each line is constructed by printing the left wing, followed by spaces, and then the right wing.
        * The pattern is symmetrical along the horizontal axis.
        * This code can be modified to change the size of the butterfly by changing the value of n.
         */
    }
}
