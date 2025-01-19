import java.util.Scanner;
public class TriangleValidatorallside
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the first side of the triangle: ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Enter the second side of the triangle: ");
        double side2 = scanner.nextDouble();
        
        System.out.print("Enter the third side of the triangle: ");
        double side3 = scanner.nextDouble();

       
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) 
        {
            System.out.println("The triangle is valid.");
        } 
        else 
        {
            System.out.println("The triangle is not valid.");
        }

        scanner.close();
    }
}


// Write a java program to input all side of a triangle and check whether triangle is whether triangle is valid or not ?