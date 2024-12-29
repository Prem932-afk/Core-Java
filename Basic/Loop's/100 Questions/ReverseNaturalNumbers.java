import java.util.Scanner;

public class ReverseNaturalNumbers 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a number n: ");
        int n = scanner.nextInt();

        // Initialize the counter variable to n
        int i = n;

        // Print all natural numbers from n to 1 using a while loop
        while (i >= 1) {
            System.out.print(i + " ");
            i--;  // Decrement the counter
        }

        scanner.close();
    }
}

