
import java.util.Scanner;

public class ReverseNumber 
{
    public static void main(String[] args) 
	{
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Variable to store the reversed number
        int reverse = 0;

        // Use a loop to reverse the number
        while (number != 0) 
		{
            int digit = number % 10;  // Get the last digit of the number
            reverse = reverse * 10 + digit;  // Append the digit to the reversed number
            number /= 10;  // Remove the last digit from the number
        }

        // Display the reversed number
        System.out.println("Reversed number: " + reverse);

        // Close the scanner
        scanner.close();
    }
}
// Write a java program to enter a number and print its reverse.