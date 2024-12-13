import java.util.Scanner;

public class VoterEligibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Prompt user for voter ID check
        System.out.print("Do you have a valid voter ID? (Enter 'v' for yes): ");
        char voterID = scanner.next().charAt(0);

        // Use switch to check voter ID validity
        switch (Character.toLowerCase(voterID)) {
            case 'v':
                // Check if the age makes them eligible
                if (age >= 18) {
                    System.out.println("You are eligible to vote.");
                } else {
                    System.out.println("You are not eligible to vote due to age.");
                }
                break;
            default:
                System.out.println("You are not eligible to vote without a valid voter ID.");
                break;
        }

    }
}
