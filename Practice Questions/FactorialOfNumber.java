public class FactorialOfNumber {
    // Function to calculate factorial of a number
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }
    /**
     * explanation: This function takes an integer n as input and returns its factorial.
     * If n is 0 or 1, it returns 1. For any other positive integer, it calls itself with (n-1)
     * and multiplies the result by n to compute the factorial.
     * @param n The number to calculate the factorial for
     * @return Factorial of the number n
     */
    

    // Main method
    public static void main(String[] args) {
        int number = 5; // Example number to calculate factorial
        int result = factorial(number); // Calling the factorial function
        System.out.println("The factorial of " + number + " is: " + result); // Displaying the result
    }
}
