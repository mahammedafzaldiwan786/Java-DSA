public class MethodScope {
    public static void main(String[] args) {
        int outerVariable = 10; // This variable is in the scope of the main method

        {
            // This is a new block scope
            int innerVariable = 20; // This variable is in the scope of this block
            System.out.println("Inner Variable: " + innerVariable); // Accessible here
            System.out.println("Outer Variable from inner block: " + outerVariable); // Accessible here
        }

        // System.out.println("Inner Variable: " + innerVariable); // This would cause a compile-time error

        System.out.println("Outer Variable: " + outerVariable); // Accessible here
    }
}
