import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        // Variable to store the sum of odd numbers
        int sum = 0;

        // Loop through all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            // Check if the number is odd
            if (i % 2 != 0) {
                sum += i;  // Add the odd number to the sum
            }
        }

        // Output the result
        System.out.println("Sum of all odd numbers between 1 and " + n + " is: " + sum);

        // Close the scanner
        scanner.close();
    }
}

//Write a java program to find sum of all odd numbers between 1 to n.