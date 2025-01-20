import java.util.Scanner;

public class GrossSalaryCalculator 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input the basic salary of the employee
        System.out.print("Enter the basic salary of the employee: ");
        double basicSalary = scanner.nextDouble();

        // Initialize HRA and DA
        double hra = 0;
        double da = 0;

        // Calculate HRA and DA based on the basic salary
        if (basicSalary <= 10000) 
        {
            hra = 0.20 * basicSalary;  // HRA = 20% of basic salary
            da = 0.80 * basicSalary;   // DA = 80% of basic salary
        } 
        else if (basicSalary <= 20000) 
        {
            hra = 0.25 * basicSalary;  // HRA = 25% of basic salary
            da = 0.90 * basicSalary;   // DA = 90% of basic salary
        } 
        else 
        {
            hra = 0.30 * basicSalary;  // HRA = 30% of basic salary
            da = 0.95 * basicSalary;   // DA = 95% of basic salary
        }

        // Calculate the gross salary
        double grossSalary = basicSalary + hra + da;

        // Output the calculated values
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);

        // Close the scanner
        scanner.close();
    }
}
//Write a java program to  input basic salary of an employee and calculate its gross salary according to following  :
//Basic Salary <= 10000 : HRA = 20%, DA = 80%
//Basic Salary <= 20000 : HRA = 25%, DA = 90%
//Basic Salary > 20000 : HRA = 30%, DA = 95%


