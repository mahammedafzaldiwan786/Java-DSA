public class DataTypes {
    public static void main(String[] args) {
        // Primitive Data Types
        byte byteValue = 10;
        short shortValue = 100;
        char charValue = 'A';
        boolean booleanValue = true;
        int intValue = 42;
        long longValue = 100000L;
        float floatValue = 5.5f;
        double doubleValue = 3.14;
       

        // Displaying Primitive Data Types
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Character Value: " + charValue);
        System.out.println("Boolean Value: " + booleanValue);
        System.out.println("Integer Value: " + intValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);
       
        

        // Non-Primitive Data Types
        String stringValue = "Hello, World!";
        Integer integerObject = Integer.valueOf(intValue);
        Double doubleObject = Double.valueOf(doubleValue);

        // Displaying Non-Primitive Data Types
        System.out.println("String Value: " + stringValue);
        System.out.println("Integer Object Value: " + integerObject);
        System.out.println("Double Object Value: " + doubleObject);
    }
    
}