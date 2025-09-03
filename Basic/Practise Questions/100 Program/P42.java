import java.util.Scanner;

public class P42
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter gender
        System.out.print("Enter your gender (M/F): ");
        char gender = scanner.next().charAt(0);

        // Use switch statement to determine the corresponding gender
        switch (Character.toUpperCase(gender)) 
        {
            case 'M':
                System.out.println("Gender: Male");
                break;
            case 'F':
                System.out.println("Gender: Female");
                break;
            default:
                System.out.println("Invalid input. Please enter 'M' or 'F'.");
                break;
        }
        scanner.close();

        
    }
}
