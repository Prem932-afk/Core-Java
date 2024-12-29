import java.util.Scanner;

public class QuadraticEquation 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input coefficients a, b, and c for the quadratic equation ax^2 + bx + c = 0
        System.out.print("Enter coefficient a: ");
        int a = scanner.nextInt();
        System.out.print("Enter coefficient b: ");
        int b = scanner.nextInt();
        System.out.print("Enter coefficient c: ");
        int c = scanner.nextInt();

        // Calculate the discriminant D = b^2 - 4ac
        int discriminant = b * b - 4 * a * c;

        // Use switch case to handle different cases based on discriminant value
        switch (discriminant) 
        {
            case 0:  // Discriminant = 0, one real root (repeated root)
                int root = -b / (2 * a);  // Calculate the root using -b / 2a
                System.out.println("The equation has one real root: " + root);
                break;
            default: // If discriminant != 0, check whether it's positive or negative
                if (discriminant > 0)
                {
                    // Two real and distinct roots (discriminant > 0)
                    int root1 = (-b + (int) Math.sqrt(discriminant)) / (2 * a);
                    int root2 = (-b - (int) Math.sqrt(discriminant)) / (2 * a);
                    System.out.println("The equation has two real and distinct roots:");
                    System.out.println("Root 1: " + root1);
                    System.out.println("Root 2: " + root2);
                } 
                else 
                {
                    // Complex roots (discriminant < 0)
                    int realPart = -b / (2 * a);
                    int imaginaryPart = (int) Math.sqrt(-discriminant) / (2 * a);
                    System.out.println("The equation has complex roots:");
                    System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
                    System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
                }
                break;
        }
    }
}
