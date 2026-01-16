public class ConditionalStatements {
    public static void main(String[] args) {
        int number = 15;

        // Simple If Statement
        if (number==15) {
            System.out.println("The number is exactly 15.");
        }

        // If-Else Statement
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        // If-Else Ladder
        if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else if (number == 0) {
            System.out.println("The number is zero.");
        } else {
            System.out.println(number + " is a positive number.");
        }

        // Nested If Statement
        if (number > 0) {
            if (number < 10) {
                System.out.println(number + " is a positive single-digit number.");
            } else {
                System.out.println(number + " is a positive multi-digit number.");
            }
        } else {
            if (number < 0) {
                System.out.println(number + " is a negative number.");
            } else {
                System.out.println("The number is zero.");
            }
        }
    }
}
