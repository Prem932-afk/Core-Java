import java.util.Scanner;

public class SwapFirstAndLastDigit 
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

        // Find the number of digits in the number
        int digits = (int) Math.log10(number);

        // Find the first digit by dividing the number by 10^digits
        int firstDigit = number / (int) Math.pow(10, digits);

        // Remove the first and last digits from the number
        int middlePart = number % (int) Math.pow(10, digits);
        middlePart = middlePart / 10;

        // Form the new number by swapping first and last digits
        int swappedNumber = lastDigit * (int) Math.pow(10, digits) + middlePart * 10 + firstDigit;

        // Output the result
        System.out.println("Number after swapping first and last digits: " + swappedNumber);

        // Close the scanner
        scanner.close();
    }
}

//Write a java program to swap first and last digits of a number.
