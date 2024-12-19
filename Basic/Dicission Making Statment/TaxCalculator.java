import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for income
        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();

        // Calculate and display tax
        double tax = 0;
        System.out.printf("Income: $%.2f%n", income);
        System.out.printf("Tax payable: $%.2f%n", tax);


        if (income <= 10000) {
            System.out.println("No tax"); // No tax for income up to 10,000
        } else if (income <= 30000) {
            tax =income  * 0.10; // 10% for the amount above 10,000 up to 30,000
        } else if (income <= 50000) {
            tax =income  * 0.10; // 20% for the amount above 30,000 up to 50,000 plus 10% on the first 20,000 above 10,000
        } else 
        {
            tax =income  * 0.30;
        }
        scanner.close();

       
    }
}
