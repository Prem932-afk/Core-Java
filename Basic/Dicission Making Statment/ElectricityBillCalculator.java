import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input fields
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of units consumed: ");
        int units = sc.nextInt();

        double finalunit=units*10;

        // Calculate based on unit ranges and discounts
        double finalbill=0;

        if (units >=1 && units<=10)
         {
            finalbill=finalunit*0.10;// Flat base amount for up to 4 units   
         }
        else if (units >= 11 && units <= 20) 
         {
             finalbill=finalunit*0.20;
         } 
        else if (units >= 21 && units <= 40) 
        {
            finalbill=finalunit*0.30;
        } 
        else if (units >= 50) 
        {
            finalbill=finalunit*0.50;
        }
        else
        {
            System.out.println("No discount");
        }

        // Output the result
        System.out.println("\nElectricity Bill Details:");
        System.out.println("Name: " + name);
        System.out.println("Units Consumed: " + units);
        System.out.println("Base Amount: $40");
        System.out.println("Total Payable Amount: $" + finalbill);
        sc.close();

       
    }
}
