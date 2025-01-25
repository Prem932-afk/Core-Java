 
import java.util.Scanner;

public class SumOfDigits 
{
    public static void main(String[] args) 
	{
        // Create a scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Variable to store the sum of digits
        int sum = 0;

        // Use a loop to calculate the sum of digits
        while (number != 0) 
		{
            sum += number % 10;  // Add the last digit to sum
            number /= 10;         // Remove the last digit
        }

        // Display the result
        System.out.println("Sum of digits: " + sum);

        // Close the scanner
        scanner.close();
    }
}
//Write a java program to calculate sum of digits of a number.