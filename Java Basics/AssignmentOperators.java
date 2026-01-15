public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Initial values: a = " + a + ", b = " + b);

        // Addition Assignment
        a += b; // Equivalent to a = a + b
        System.out.println("After a += b: a = " + a); // a = 15

        // Subtraction Assignment
        a -= b; // Equivalent to a = a - b
        System.out.println("After a -= b: a = " + a); // a = 10

        // Multiplication Assignment
        a *= b; // Equivalent to a = a * b
        System.out.println("After a *= b: a = " + a); // a = 50

        // Division Assignment
        a /= b; // Equivalent to a = a / b
        System.out.println("After a /= b: a = " + a); // a = 10

        // Modulus Assignment
        a %= b; // Equivalent to a = a % b
        System.out.println("After a %= b: a = " + a); // a = 0
    }
}
