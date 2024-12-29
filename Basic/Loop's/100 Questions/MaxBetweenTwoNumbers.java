import java.util.Scanner;

public class MaxBetweenTwoNumbers 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Initialize a variable to hold the result
        int result = 0;

        // Use switch case with expressions to compare the numbers
        switch (num1 > num2 ? 1 : (num1 < num2 ? -1 : 0)) 
        {
            case 1:  // num1 > num2
                result = num1;
                break;
            case -1: // num1 < num2
                result = num2;
                break;
            case 0:  // num1 == num2
                System.out.println("Both numbers are equal.");
                result = num1;  // Can return either number since they are equal
                break;
        }

        // Output the result if numbers are not equal
        if (num1 != num2) 
        {
            System.out.println("The maximum number is: " + result);
        }
    }
}

