import java.util.Scanner;

public class CountDigits 
{
    public static void main(String[] args) 
    {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize a counter for the number of digits
        int count = 0;

        // Handle the case when the number is 0, which has 1 digit
        if (number == 0) 
        {
            count = 1;
        } else 
        {
            // Loop to count digits by repeatedly dividing by 10
            while (number != 0) 
            {
                number /= 10;  // Remove the last digit
                count++;  // Increment the count
            }
        }

        // Output the result
        System.out.println("Number of digits: " + count);

        // Close the scanner
        scanner.close();
    }
}

//Write a java program to count number of digits in a number.