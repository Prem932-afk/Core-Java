import java.util.Scanner;

public class DayOfWeek 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input the day number
        System.out.print("Enter a number between 1 and 7: ");
        int dayNumber = scanner.nextInt();

        // Use switch-case to determine the day of the week
        switch (dayNumber) 
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
                break;
        }

        // Close the scanner
        scanner.close();
    }
}
