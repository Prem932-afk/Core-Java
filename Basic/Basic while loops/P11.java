
import java.util.Scanner; // Import Scanner for user input

public class P11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        
        // Ask for starting and ending range from the user
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt(); // Read starting number
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt(); // Read ending number
        
        // Initialize the while loop
        int i = start; // Start at the user-provided starting number
        while (i <= end) {
            if(i%2!=0)
            { // Loop until the ending number
            System.out.println(i); 
            }// Print the current number
            i++; // Increment the counter
        }

        
    }
}

