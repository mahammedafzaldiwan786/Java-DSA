public class CheckStudentResult {
    public static void main(String[] args) {
        int marks = 75; // Example marks
        System.out.println("Student Marks: " + marks);

        // Check if the student has passed or failed
        if (marks >= 40) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }

        // Determine the grade based on marks
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else if (marks >= 50) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }
    }
}
