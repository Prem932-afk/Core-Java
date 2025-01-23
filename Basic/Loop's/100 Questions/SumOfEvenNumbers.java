import java.util.Scanner;

public class SumOfEvenNumbers 
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number n
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        // Initialize sum to 0 and counter to 2 (first even number)
        int sum = 0;
        int i = 2;

        // While loop to calculate the sum of even numbers between 1 and n
        while (i <= n) 
        {
            sum += i; // Add i to sum
            i += 2; // Increment by 2 to get the next even number
        }

        // Display the result
        System.out.println("The sum of even numbers between 1 and " + n + " is: " + sum);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

//Write a java program to find sum of all even numbers between 1 to n.