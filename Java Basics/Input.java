
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your full name : ");
        String name = sc.nextLine();
        System.out.println("Name :" + name);

         System.out.print("Enter your first name : ");
        String word = sc.next();
        System.out.println("first name :" + word);

         System.out.print("Enter byte value : ");
        byte byteValue = sc.nextByte();
        System.out.println("byteValue :" + byteValue);

         System.out.print("Enter short value: ");
        short shortValue = sc.nextShort();
        System.out.println("shortValue :" + shortValue);

         System.out.print("Enter boolean value: ");
        boolean booleanValue = sc.nextBoolean();
        System.out.println("booleanValue :" + booleanValue);

         System.out.print("Enter int value: ");
        int intValue = sc.nextInt();
        System.out.println("intValue :" + intValue);

         System.out.print("Enter float value: ");
        float floatValue = sc.nextFloat();
        System.out.println("floatValue :" + floatValue);

         System.out.print("Enter long value: ");
        long longValue = sc.nextLong();
        System.out.println("longValue :" + longValue);

         System.out.print("Enter double value: ");
         double doubleValue = sc.nextDouble();
        System.out.println("doubleValue :" + doubleValue);

    }
}
