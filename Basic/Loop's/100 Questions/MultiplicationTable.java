import java.util.Scanner;

public class MultiplicationTable 
{
    public static void main(String[] args) 
    {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();

        // Loop to print the multiplication table from 1 to 10
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        // Close the scanner
        scanner.close();
    }
}

// Write a java program to print multiplication table of any number.