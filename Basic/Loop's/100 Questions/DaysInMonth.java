import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the month number (1-12)
        System.out.print("Enter the month number (1-12): ");
        int month = scanner.nextInt();

        // Variable to store the number of days in the month
        int days;

        // Use switch case to determine the number of days in the month
        switch(month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                days = 31;
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                days = 30;
                break;
            case 2: // February
                System.out.print("Enter the year: ");
                int year = scanner.nextInt();
                // Check if the year is a leap year
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29; // Leap year
                } else {
                    days = 28; // Non-leap year
                }
                break;
            default:
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
                return;
        }

        // Output the number of days in the month
        System.out.println("The number of days in month " + month + " is: " + days);
        
    }
}
