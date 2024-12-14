import java.util.Scanner;
public class P17 {
    public static void main(String[] args) {
        int i = 2; // Start at the first even number
        int sum = 0; // Initialize the sum variable
        
        while (i <= 100) { // Loop from 2 up to 100
            sum =sum + i; // Add the current even number to the sum
            i=i+2; // Move to the next even number
        }

        // Print the total sum of all even numbers from 1 to 100
        System.out.println("Sum of all even numbers from 1 to 100 is: " + sum);
    }
}

