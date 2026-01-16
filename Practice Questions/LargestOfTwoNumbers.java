public class LargestOfTwoNumbers {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        // Using a simple if-else statement to find the largest number
        if (num1 > num2) {
            System.out.println("The largest number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("The largest number is: " + num2);
        } else {
            System.out.println("Both numbers are equal: " + num1);
        }
    }
}
