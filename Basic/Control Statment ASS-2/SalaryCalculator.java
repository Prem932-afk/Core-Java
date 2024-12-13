import java.util.Scanner;

public class SalaryCalculator{
    public static void main(String[] args) {
        double finalesalary;
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        System.out.print("Enter your bank details: ");
        String bankDetails = scanner.nextLine();

        System.out.print("Enter your full salary: ");
        int fullSalary = scanner.nextInt();

        System.out.print("Enter the number of holidays taken: ");
        int holidays = scanner.nextInt();


        // Output the results
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Bank Details: " + bankDetails);
        System.out.println("Salary: " + fullSalary);
        System.out.println("Holidays Taken: " + holidays);

        if (holidays == 1) 
        {
          System.out.println("Full Salary");  // Full salary for 1 holiday
        } 
        else if (holidays >= 2 && holidays <= 5)
        {
          finalesalary=fullSalary*0.05;// 5% of full salary
        } 
        else if (holidays >= 6 && holidays <= 14) 
        {
         finalesalary=fullSalary*0.10;// 5 // 10% of full salary
        } 
        else if (holidays == 15) 
        {
         finalesalary=fullSalary*0.50;// 5 // 50% of full salary
        } 
        else 
        {
            System.out.println("Input not matched");// No salary for more than 15 holidays
        }
    }
        

       
    }

   

