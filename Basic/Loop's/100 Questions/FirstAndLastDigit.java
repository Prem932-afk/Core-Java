import java.util.Scanner;

public class FirstAndLastDigit 
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

        // Output the first and last digits
        System.out.println("First digit: " + firstDigit);
        System.out.println("Last digit: " + lastDigit);

        // Close the scanner
        scanner.close();
    }
}

    

//Write a java program to find first and last digit of a number.