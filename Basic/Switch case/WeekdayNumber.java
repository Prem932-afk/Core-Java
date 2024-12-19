
import java.util.Scanner;

public class WeekdayNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for a week day number
        System.out.print("Enter a number (1-7) to get the corresponding weekday: ");
        int dayNumber = scanner.nextInt();

        // Use switch to determine the weekday name
        switch (dayNumber) {
            case 1:
                System.out.println("1 Sunday");
                break;
            case 2:
                System.out.println("2 Monday");
                break;
            case 3:
                System.out.println("3 Tuesday");
                break;
            case 4:
                System.out.println("4 Wednesday");
                break;
            case 5:
                System.out.println("5 Thursday");
                break;
            case 6:
                System.out.println("6 Friday");
                break;
            case 7:
                System.out.println("7 Saturday");
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
                break;
        }
        scanner.close();
    }
}
