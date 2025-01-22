import java.util.Scanner;

public class SimpleCalculator 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for two numbers
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        // Prompt user for operation
        System.out.print("Enter operation (+): ");
        char operator = scanner.next().charAt(0);

        // Perform calculation using switch
        switch (operator) 
        {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            default:
                System.out.println("Invalid operation. Supported operation: '+'");
                break;
        }
        scanner.close();
       
    }
}
//Write a java program to create Simple Calculator using switch case.

