public class TypePromotionInExpressions {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        // byte b3 = b1 + b2; // Compilation error: cannot convert from int to byte

        int i1 = 100;
        int i2 = 200;
        int i3 = i1 + i2; // Valid

        float f1 = 5.5f;
        float f2 = 4.5f;
        float f3 = f1 + f2; // Valid

        double d1 = 10.5;
        double d2 = 20.5;
        double d3 = d1 + d2; // Valid

        // Mixed type expression
        double result = b1 + i1 + f1 + d1; // All operands promoted to double
        /**
         * Explanation:
         * 1. When performing arithmetic operations, Java promotes smaller data types to larger data types
         * 2. In mixed-type expressions, all operands are promoted to the largest data type involved in the expression
         */
        System.out.println("Result of mixed type expression: " + result);
    }
}
