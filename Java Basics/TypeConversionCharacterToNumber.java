public class TypeConversionCharacterToNumber {

    public static void main(String[] args) {
        char character = 'A';

        // Implicit conversion from char to int
        int intValue = character;
        System.out.println("Character: " + character);
        System.out.println("Integer value (implicit conversion): " + intValue);

        // Explicit conversion from char to int
        int explicitIntValue = (int) character;
        System.out.println("Integer value (explicit conversion): " + explicitIntValue);
    }
}
