import java.util.Scanner;

public class PositiveNegativeZero 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Use switch case based on the number's sign
        switch (Integer.signum(number)) {
            case 1: // If number > 0, it is positive
                System.out.println(number + " is a positive number.");
                break;
            case -1: // If number < 0, it is negative
                System.out.println(number + " is a negative number.");
                break;
            case 0: // If number == 0, it is zero
                System.out.println(number + " is zero.");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}



//Write a C program to check whether a number is positive, negative or zero using switch case.