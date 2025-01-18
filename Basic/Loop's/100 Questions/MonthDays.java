

import java.util.Scanner;

public class MonthDays 
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a month number
        System.out.print("Enter month number (1 to 12): ");
        int month = scanner.nextInt();

        // Prompt the user to enter a year (for leap year calculation in February)
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Check the number of days in the month
        int days;
        
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) 
        {
            days = 31;
            system.out.println("days"); // Months with 31 days
        } 
        else if (month == 4 || month == 6 || month == 9 || month == 11) 
        {
            days = 30; // Months with 30 days
            system.out.println("days");
        } 
        else if (month == 2) 
        {
            // Check if it's a leap year for February
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
            {
                days = 29; // Leap year February
                system.out.println("days");
            } 
            else 
            {
                days = 28; // Regular February
                system.out.println("days");
            }
        } 
        else 
        {
            System.out.println("Invalid month number! Please enter a number between 1 and 12.");
            scanner.close();
            return;
        }

        // Output the result
        System.out.println("Month " + month + " in year " + year + " has " + days + " days.");
        
        // Close the scanner
        scanner.close();
    }
}
//.Write a java program to input month number and print number of days in that month ?

