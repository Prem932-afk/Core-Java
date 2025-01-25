
import java.util.Scanner;

public class DigitFrequency 
{
    public static void main(String[] args) 
	{
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Array to store frequency of each digit (0-9)
        int[] frequency = new int[10];

        // Process each digit of the number
        while (number != 0) 
		{
            int digit = number % 10;  // Get the last digit
            frequency[digit]++;  // Increment the frequency of the digit
            number /= 10;  // Remove the last digit
        }

        // Display the frequency of each digit
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) 
		{
            if (frequency[i] > 0) 
			{
                System.out.println(i + ": " + frequency[i]);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
// Write a java program to find frequency of each digit in a given integer.