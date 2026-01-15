public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 5;  // In binary: 0101
        int b = 3;  // In binary: 0011
        System.out.println("Bitwise Operations between a = " + a + " and b = " + b);

        // Bitwise AND
        int andResult = a & b; // Result: 0001 (1 in decimal)
        System.out.println("Bitwise AND (a & b): " + andResult);
        /**
         * Explanation:
         * 0101 (5 in binary)
         * 0011 (3 in binary)
         * -----
         * 0001 (1 in binary, result of a & b)
         */

        // Bitwise OR
        int orResult = a | b; // Result: 0111 (7 in decimal)
        System.out.println("Bitwise OR (a | b): " + orResult);
        /**
         * Explanation:
         * 0101 (5 in binary)
         * 0011 (3 in binary)
         * -----
         * 0111 (7 in binary, result of a | b)
         */

        // Bitwise XOR
        int xorResult = a ^ b; // Result: 0110 (6 in decimal)
        System.out.println("Bitwise XOR (a ^ b): " + xorResult);
        /**
         * Explanation:
         * 0101 (5 in binary)
         * 0011 (3 in binary)
         * -----
         * 0110 (6 in binary, result of a ^ b)
         */

        // Bitwise NOT
        int notResult = ~a; // Result: 1010 (in two's complement, -6 in decimal)
        System.out.println("Bitwise NOT (~a): " + notResult);
        /**
         * Explanation:
         * 0101 (5 in binary)
         * -----
         * 1010 (inverted bits, which is -6 in two's complement)
         */

        // Left Shift
        int leftShiftResult = a << 1; // Result: 1010 (10 in decimal)
        System.out.println("Left Shift (a << 1): " + leftShiftResult);
        /**
         * Explanation:
         * 0101 (5 in binary)
         * -----
         * 1010 (10 in binary, result of a << 1)
         */

        // Right Shift
        int rightShiftResult = a >> 1; // Result: 0010 (2 in decimal)
        System.out.println("Right Shift (a >> 1): " + rightShiftResult);
        /**
         * Explanation:
         * 0101 (5 in binary)
         * -----
         * 0010 (2 in binary, result of a >> 1)
         */
    }
}
