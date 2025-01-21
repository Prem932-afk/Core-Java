
import java.util.Scanner;

public class EmployeeSalary 
{
    public static void main(String[] args) 
    {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Accept employee's ID (maximum of 10 characters)
        System.out.print("Input the Employee's ID (Max. 10 chars): ");
        String employeeID = scanner.nextLine();

        // Accept the total working hours in a month
        System.out.print("Input the working hrs: ");
        float workingHours = scanner.nextFloat();

        // Accept the salary amount per hour
        System.out.print("Salary amount/hr: ");
        float salaryPerHour = scanner.nextFloat();

        // Calculate the total salary
        float salary = workingHours * salaryPerHour;

        // Print the Employee's ID and salary with two decimal places
        System.out.printf("Employees ID = %s\n", employeeID);
        System.out.printf("Salary = U$ %.2f\n", salary);
    }
}

// Write a java program that accepts an employee's ID, total worked hours of a month and the amount he received per hour. Print the employee's ID and salary (with two decimal places) of a particular month :         

//  Test Data :
//  Input the Employees ID(Max. 10 chars): 0342
//  Input the working hrs: 8
//  Salary amount/hr: 15000
//  Expected Output:
//  Employees ID = 0342
//  Salary = U$ 120000.00 
