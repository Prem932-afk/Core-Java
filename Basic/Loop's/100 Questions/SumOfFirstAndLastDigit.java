import java.util.Scanner;

public class SumOfFirstAndLastDigit 
{
    public static void main(String[] args) 
    {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find the last digit (remainder when divided by 10)
        int lastDigit = number % 10;

        // Find the first digit (loop until the number is reduced to a single digit)
        int firstDigit = number;
        while (firstDigit >= 10) 
        {
            firstDigit /= 10;
        }

        // Calculate the sum of the first and last digits
        int sum = firstDigit + lastDigit;

        // Output the result
        System.out.println("Sum of first and last digits: " + sum);

        // Close the scanner
        scanner.close();
    }
}

// Write a java program to find sum of first and last digit of a number.