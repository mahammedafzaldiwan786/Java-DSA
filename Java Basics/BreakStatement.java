public class BreakStatement {
    public static void main(String[] args) {
        System.out.println("Demonstrating the break statement in a for loop:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Breaking the loop when i is 3");
                break; // Exit the loop when i is 3
            }
            System.out.println(i);
        }
        /**
         * Explanation:
         * The loop starts with i = 1 and increments i by 1 in each iteration until i reaches 5.
         *  When i becomes 3, the break statement is executed, causing the loop to terminate immediately.
         * As a result, the numbers 1 and 2 are printed, but the loop stops before printing 3, 4, and 5.
         */
    }
}
