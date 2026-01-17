public class SwitchCase {
    public static void main(String[] args) {
        int day = 3; // Example day number
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("Day " + day + " is: " + dayName);

        /**
         * Explanation:
         * The switch statement evaluates the variable 'day'.
         * Based on its value, it matches one of the case labels (1 to 7).
         * When a match is found, the corresponding block of code is executed.
         * The 'break' statement prevents fall-through to subsequent cases .
         * If no case matches, the 'default' block is executed.
         * This is useful for replacing multiple if-else statements when checking a single variable against multiple values.
         */
    }
}
