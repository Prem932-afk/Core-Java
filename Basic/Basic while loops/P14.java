import java.util.Scanner;
class P14 {
    public static void main(String[] args) {
        int i = 2; // Outer loop starting at 2
        while (i <= 10) { // Loop through numbers 2 to 10
            System.out.println("Multiplication Table for " + i);
            int j = 1; // Inner loop counter starting at 1
            while (j <= 10) { // Loop from 1 to 10 for each number
                System.out.println(i + " x " + j + " = " + (i * j));
                j++; // Increment inner loop counter
            }
            System.out.println(); // Add a blank line between tables
            i++; // Increment outer loop counter
        }
    }
}
