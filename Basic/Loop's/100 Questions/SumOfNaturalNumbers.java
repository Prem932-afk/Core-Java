import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number n
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        // Initialize sum to 0 and counter to 1
        int sum = 0;
        int i = 1;

        // While loop to calculate the sum of numbers from 1 to n
        while (i <= n) {
            sum += i; // Add i to sum
            i++; // Increment i
        }

        // Display the result
        System.out.println("The sum of natural numbers from 1 to " + n + " is: " + sum);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
//Write a java program to find sum of all natural numbers between 1 to n.