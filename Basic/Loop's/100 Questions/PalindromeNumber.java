
import java.util.Scanner;

public class PalindromeNumber 
{
    public static void main(String[] args) 
	{
        // Create a scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Store the original number to compare later
        int originalNumber = number;

        // Variable to store the reversed number
        int reverse = 0;

        // Reverse the number
        while (number != 0) 
		{
            int digit = number % 10;  // Get the last digit of the number
            reverse = reverse * 10 + digit;  // Append the digit to the reversed number
            number /= 10;  // Remove the last digit from the number
        }

        // Check if the original number and the reversed number are the same
        if (originalNumber == reverse) 
		{
            System.out.println(originalNumber + " is a palindrome.");
        } 
		else 
		{
            System.out.println(originalNumber + " is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }
}
//Write a java program to check whether a number is palindrome or not.
