import java.util.Scanner;

public class equilateral
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input the sides of the triangle
        System.out.print("Enter the first side of the triangle: ");
        int side1 = scanner.nextInt();
        
        System.out.print("Enter the second side of the triangle: ");
        int side2 = scanner.nextInt();
        
        System.out.print("Enter the third side of the triangle: ");
        int side3 = scanner.nextInt();

        // Check if the sides are valid for a triangle (all sides must be positive)
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Sides of a triangle must be positive.");
        } else if (side1 == side2 && side2 == side3) {
            // Equilateral triangle: All sides are equal
            System.out.println("The triangle is equilateral.");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            // Isosceles triangle: Two sides are equal
            System.out.println("The triangle is isosceles.");
        } else {
            // Scalene triangle: All sides are different
            System.out.println("The triangle is scalene.");
        }

        // Close the scanner
        scanner.close();
    }
}
//Write a java program to  check whether the triangle is equilateral, isosceles or scalene triangles ?


