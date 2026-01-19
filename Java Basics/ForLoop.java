public class ForLoop {
    public static void main(String[] args) {
        // Example of a for loop that prints numbers from 1 to 5
        System.out.println("For loop from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

       // nested for loop example
        System.out.println("Nested for loop (multiplication table 1 to 3):");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
        /**
         * Explanation:
         * The outer loop runs with 'i' taking values from 1 to 3.
         * For each value of 'i', the inner loop runs with 'j' taking values
         * from 1 to 3, printing the product of 'i' and 'j'.
         * This results in a multiplication table for numbers 1 to 3.
         */

        
    }
    
}
