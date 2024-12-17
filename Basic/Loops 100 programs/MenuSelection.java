import java.util.Scanner;

public class MenuSelection {
    public static void main(String[] args) {
        // Create a Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Display the menu
        System.out.println("Welcome to the Restaurant Menu!");
        System.out.println("Please select an option:");
        System.out.println("1. Pizza - $12.99");
        System.out.println("2. Burger - $8.99");
        System.out.println("3. Pasta - $10.99");
        System.out.print("Enter your choice (1-3): ");

        // Read user input
        int choice = scanner.nextInt();

        // Determine the selection using if-else if-else statements
        if (choice == 1) {
            System.out.println("You selected: Pizza - $12.99");
        } else if (choice == 2) {
            System.out.println("You selected: Burger - $8.99");
        } else if (choice == 3) {
            System.out.println("You selected: Pasta - $10.99");
        } else {
            System.out.println("Invalid choice. Please select a valid option.");
        }

      
    }
}
