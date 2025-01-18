
import java.util.Scanner;
public class WeekdayCheck 
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a week number
        System.out.print("Enter week number (1 to 7): ");
        int weekNumber = scanner.nextInt();
        
        // Check the week number and print the corresponding weekday using if-else conditions
        if (weekNumber == 1) 
        {
            System.out.println("Day 1 is Sunday.");
        } 
        else if (weekNumber == 2) 
        {
            System.out.println("Day 2 is Monday.");
        } 
        else if (weekNumber == 3) 
        {
            System.out.println("Day 3 is Tuesday.");
        } 
        else if (weekNumber == 4) 
        {
            System.out.println("Day 4 is Wednesday.");
        } 
        else if (weekNumber == 5) 
        {
            System.out.println("Day 5 is Thursday.");
        } 
        else if (weekNumber == 6) 
        {
            System.out.println("Day 6 is Friday.");
        } 
        else if (weekNumber == 7) 
        {
            System.out.println("Day 7 is Saturday.");
        } 
        else 
        {
            System.out.println("Invalid week number! Please enter a number between 1 and 7.");
        }
        
        // Close the scanner
        scanner.close();
    }
}


//Write a java program to input week number and print week day ?
