public class LoopScope {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            int loopVariable = i * 2; // Variable in the scope of the loop
            System.out.println("Inside loop iteration " + i + ":");
            System.out.println("i: " + i); // Accessible here
            System.out.println("loopVariable: " + loopVariable); // Accessible here
        }

        // System.out.println("i: " + i); // This would cause a compile-time error
        // System.out.println("loopVariable: " + loopVariable); // This would also cause a compile-time error
    }
}
