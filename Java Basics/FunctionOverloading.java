public class FunctionOverloading {
    // Function to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Function to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Function to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        FunctionOverloading fo = new FunctionOverloading();

        // Calling the method with two integers
        System.out.println("Sum of 2 and 3: " + fo.add(2, 3));

        // Calling the method with three integers
        System.out.println("Sum of 1, 2 and 3: " + fo.add(1, 2, 3));

        // Calling the method with two double values
        System.out.println("Sum of 2.5 and 3.5: " + fo.add(2.5, 3.5));
    }
    /**
     * Output:
     * Sum of 2 and 3: 5
     * Sum of 1, 2 and 3: 6
     * Sum of 2.5 and 3.5: 6.0
     * Explanation:
     * In this example, we have three overloaded methods named 'add'.
     * The method that gets called depends on the number and type of arguments passed.
     * When we call 'add(2, 3)', the first method is invoked.
     * When we call 'add(1, 2, 3)', the second method is invoked.
     * When we call 'add(2.5, 3.5)', the third method is invoked.
     * This demonstrates function overloading in Java.
     * 
     */
}
