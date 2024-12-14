import java.util.Scanner;
class P16 {
    public static void main(String[] args) {
        int i = 10; // Start at 10 (since 2 x 10 = 20)
        
        while (i >= 1) { // Loop in reverse
            System.out.println("2 x " + i + " = " + (2 * i));
            i--; // Decrement the counter
        }
    }
}
