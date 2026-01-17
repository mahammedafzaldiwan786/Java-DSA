
import java.util.Scanner;

class IncomeTexCalculator{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your income: ");
        double income = sc.nextDouble();
        double tax = 0;
        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = 0.05 * (income - 250000);
            // 5% tax on income between 2,50,001 and 5,00,000
            // Example: If income is 400,000 then tax = 0.05 * (400,000 - 250,000) = 7,500
        } else if (income <= 1000000) {
            tax = 0.05 * 250000 + 0.20 * (income - 500000);
            // 5% tax on first 2,50,000 (i.e., 12,500) + 20% tax on income between 5,00,001 and 10,00,000
            // Example: If income is 800,000 then tax = 12,500 + 0.20 * (800,000 - 500,000) = 72,500
        } else {
            tax = 0.05 * 250000 + 0.20 * 500000 + 0.30 * (income - 1000000);
            // 5% tax on first 2,50,000 (i.e., 12,500) + 20% tax on next 5,00,000 (i.e., 1,00,000) + 30% tax on income above 10,00,000 
            // Example: If income is 1,500,000 then tax = 12,500 + 1,00,000 + 0.30 * (1,500,000 - 1,000,000) = 2,62,500
        }
        System.out.println("Your income tax is: " + tax);

        /**
         * Explanation:
         * The program calculates income tax based on the following slabs:
         * - Up to 2,50,000: No tax
         * - 2,50,001 to 5,00,000: 5%
         * - 5,00,001 to 10,00,000: 20%
         * - Above 10,00,000: 30%
         * The user is prompted to enter their income, and the program computes the tax accordingly.
         * Finally, it prints the calculated tax.
         * 
         */
    }
}