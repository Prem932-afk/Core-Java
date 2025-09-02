// Q. 1 7 Write a java program to enter  P, T, R and calculate Simple Interest?
import java.util.Scanner;

public class P17
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input principal amount
        System.out.print("Enter Principal (P): ");
        double principal = scanner.nextDouble();

        // Input time period
        System.out.print("Enter Time (T) in years: ");
        double time = scanner.nextDouble();

        // Input rate of interest
        System.out.print("Enter Rate of Interest (R) in percentage: ");
        double rate = scanner.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * time * rate) / 100;

        // Output the result
        System.out.println("Simple Interest = " + simpleInterest);

        scanner.close();
    }
}
