public class Functions {
    /**
     * type of function: no argument, no return value
     * This function prints a greeting message to the console.
     */
    // type of function: no argument, no return value
    static void greet() {
        System.out.println("no argument, no return value function called:");
        System.out.println("Hello, welcome to Java programming!");
    }
    /**
     * type of function: with argument, with return value
     * This function takes two integers as arguments and returns their sum.
     * @param a First integer
     * @param b Second integer
     * @return Sum of a and b
     */

    //type of function: with argument, with return value
    static int add(int a, int b) {
        System.out.println("with argument, with return value function called:");
        return a + b;
    }
    /**
     * type of function: with argument, no return value
     * This function takes two integers as arguments and prints their sum.
     * @param a First integer
     * @param b Second integer
     */

    //type of function: with argument, no return value
    static void displaySum(int a, int b) {
        int sum = a + b;
        System.out.println("with argument, no return value function called:");
        System.out.println("The sum is: " + sum);
    }
    /**
     * type of function: no argument, with return value
     * This function returns a greeting message.
     * @return Greeting message as a String
     */

    //type of function: no argument, with return value
    static String getGreetingMessage() {
        System.out.println("no argument, with return value function called:");
        return "Hello, welcome to Java programming!";
    }
    /**
     * type of function: no argument with return value
     * This function returns a greeting message.
     * this function does not take any arguments but returns a String value.
     */
    // main method
    public static void main(String[] args) {
        // calling the function
        greet();
        int result = add(5, 10);
        System.out.println("The addition result is: " + result);
        displaySum(7, 3);
        String message = getGreetingMessage();
        System.out.println(message);
    }
}
