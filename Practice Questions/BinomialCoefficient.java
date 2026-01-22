public class BinomialCoefficient {
    // Function to calculate binomial coefficient C(n, k)
    static int binomialCoefficient(int n, int k) {
        // Base cases
        if (k == 0 || k == n) {
            return 1;
        }
        // Recursive case
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
    /**
     * explanation: This function takes two integers n and k as input and returns the binomial coefficient C(n, k).
     * It uses the recursive formula C(n, k) = C(n-1, k-1) + C(n-1, k) with base cases C(n, 0) = 1 and C(n, n) = 1.
     * @param n The total number of items
     * @param k The number of items to choose
     * @return Binomial coefficient C(n, k)
     */

    // Main method
    public static void main(String[] args) {
        int n = 5; // Example value for n
        int k = 2; // Example value for k
        int result = binomialCoefficient(n, k); // Calling the binomialCoefficient function
        System.out.println("The binomial coefficient C(" + n + ", " + k + ") is: " + result); // Displaying the result
    }
}
