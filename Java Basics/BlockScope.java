public class BlockScope {
    public static void main(String[] args) {
        int x = 5; // Variable in the scope of the main method

        {
            // Start of a new block
            int y = 10; // Variable in the scope of this block
            System.out.println("Inside block:");
            System.out.println("x: " + x); // Accessible here
            System.out.println("y: " + y); // Accessible here
        } // End of the block

        System.out.println("Outside block:");
        System.out.println("x: " + x); // Accessible here
        // System.out.println("y: " + y); // This would cause a compile-time error
    }
}
