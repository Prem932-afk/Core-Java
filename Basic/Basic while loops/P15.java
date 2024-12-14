import java.util.Scanner;
class P15 {
    public static void main(String[] args) {
        int i = 1; // Start at 1
        while (i <= 100) { // Loop from 1 to 100
            if (i % 7 == 0 && i % 3 == 0) { // Check if the number is divisible by both 7 and 3
                System.out.println(i); // Print the number
            }
            i++; // Increment the counter
        }
    }
}
