import java.util.Scanner;

public class SimpleCalculator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Displaying the options to the user
        System.out.println("Simple Calculator");
        System.out.println("Select operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        // Taking the user's choice for the operation
        System.out.print("Enter choice (1/2/3/4): ");
        int choice = scanner.nextInt();

        // Taking two numbers as input
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Using switch case to perform the operation based on the user's choice
        double result;
        switch (choice) 
        {
            case 1:  // Addition
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
            case 2:  // Subtraction
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
            case 3:  // Multiplication
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
            case 4:  // Division
                // Handling division by zero
                if (num2 == 0) 
                {
                    System.out.println("Error! Division by zero is not allowed.");
                } 
                else 
                {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                }
                break;
            default:
                System.out.println("Invalid choice! Please choose a valid operation.");
        }

        scanner.close();
    }
}

