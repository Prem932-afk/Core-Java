import java.util.Scanner;

public class ElectricityBillCalculator 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input the total units consumed
        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();

        double totalBill = 0;

        // Calculate the bill based on the unit consumption
        if (units <= 50) 
        {
            // Charge for first 50 units
            totalBill = units * 0.50;
        } 
        else if (units <= 150) 
        {
            // Charge for first 50 units
            totalBill = 50 * 0.50;
            // Charge for next 100 units
            totalBill += (units - 50) * 0.75;
        } 
        else if (units <= 250) 
        {
            // Charge for first 50 units
            totalBill = 50 * 0.50;
            // Charge for next 100 units
            totalBill += 100 * 0.75;
            // Charge for next 100 units
            totalBill += (units - 150) * 1.20;
        } 
        else 
        {
            // Charge for first 50 units
            totalBill = 50 * 0.50;
            // Charge for next 100 units
            totalBill += 100 * 0.75;
            // Charge for next 100 units
            totalBill += 100 * 1.20;
            // Charge for units above 250
            totalBill += (units - 250) * 1.50;
        }

        // Output the total bill
        System.out.println("Total electricity bill: Rs. " + totalBill);

        // Close the scanner
        scanner.close();
    }
}

//Write a java program to input electricity unit charges and calculate total electricity bill according to the given condition  ?
// For first 50 units Rs. 0.50/unit
// For next 100 units Rs. 0.75/unit
// For next 100 units Rs. 1.20/unit
// For unit above 250 Rs. 1.50/unit
