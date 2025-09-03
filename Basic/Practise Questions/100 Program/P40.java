//Q.40 Write a Java program to find the power of a number using a for loop ?
import java.util.Scanner;

public class P40
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        
        int result = 1;
        for (int i = 1; i <= exponent; i++) 
        {
            result =result * base;  // Multiply base exponent times
        }
        
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}

