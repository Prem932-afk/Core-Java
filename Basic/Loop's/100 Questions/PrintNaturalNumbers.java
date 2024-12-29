import java.util.Scanner;

public class PrintNaturalNumbers 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a number n: ");
        int n = scanner.nextInt();

        // Initialize a counter variable
        int i = 1;

        // Print all natural numbers from 1 to n using a while loop
        while (i <= n) {
            System.out.print(i + " ");
            i++;  // Increment the counter
        }

        scanner.close();
    }
}

