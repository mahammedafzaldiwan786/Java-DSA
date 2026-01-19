public class ContinueStatement {
    public static void main(String[] args) {
        System.out.println("Demonstrating the continue statement in a for loop:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Continuing the loop when i is 3");
                continue; // Skip the rest of the loop when i is 3
            }
            System.out.println(i);
        }
        /**
         * Explanation:
            * The loop starts with i = 1 and increments i by 1 in each iteration until i reaches 5.
            * When i becomes 3, the continue statement is executed, causing the current iteration to skip the remaining code and move to the next iteration.
            * As a result, the numbers 1, 2, 4, and 5 are printed, but 3 is skipped.
         */
    }
}
