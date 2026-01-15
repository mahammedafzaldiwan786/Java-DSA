public class LogicalOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Values: a = " + a + ", b = " + b);
        // Using logical AND operator
        if (a < 15 && b > 15) {
            System.out.println("logical AND operator: a < 15 && b > 15");
            System.out.println("Both conditions are true.");
        }
        // Using logical OR operator
        if (a < 5 || b > 15) {
            System.out.println("logical OR operator: a < 5 || b > 15");
            System.out.println("At least one condition is true.");
        }
        // Using logical NOT operator
        if (!(a > 15)) {
            System.out.println("logical NOT operator: !(a > 15)");
            System.out.println("Condition is false, so NOT operator makes it true.");
        }
    }
}
