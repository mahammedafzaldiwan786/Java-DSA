class DimondPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the diamond pattern

        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Spaces before the stars
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Stars in the upper half
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Spaces before the stars
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Stars in the lower half
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /**
         * Expected Output:
              *
             ***
            *****
           *******
          *********
           *******
            *****
             ***
              *
        
         * Explanation:
         * The pattern consists of two symmetrical halves (upper and lower).
         * Each half has a series of asterisks (*) that form the shape of a diamond.
         * The number of asterisks increases from 1 to (2*n - 1) in the upper half and decreases back to 1 in the lower half.
         * Spaces are added before the asterisks to center-align the diamond shape.
         * Each line is constructed by printing spaces followed by asterisks.
         * The pattern is symmetrical along both horizontal and vertical axes.
         * This code can be modified to change the size of the diamond by changing the value of n.
         */
    }
}
