
import java.util.Scanner;

public class ProductOfDigits 
{
    public static void main(String[] args) 
	{
        // Create a scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Variable to store the product of digits
        int product = 1;

        // Check if the number is 0 (special case)
        if (number == 0) 
		{
            product = 0;
        } 
		else 
		{
            // Use a loop to calculate the product of digits
            while (number != 0) 
			{
                product *= number % 10;  // Multiply the last digit to product
                number /= 10;             // Remove the last digit
            }
        }

        // Display the result
        System.out.println("Product of digits: " + product);

        // Close the scanner
        scanner.close();
    }
}
//Write a java program to calculate product of digits of a number.