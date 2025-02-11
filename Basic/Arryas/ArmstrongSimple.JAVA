import java.util.Scanner;

public class ArmstrongSimple 
{

    public static void main(String[] args) 
    {
        // Input the number

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Variables
        int sum = 0, originalNum = num;
        
        // Calculate the sum of digits raised to the power of number of digits
        while (num > 0) 
        {
            int digit = num % 10;
            sum += digit * digit * digit; // Cubing the digit for 3-digit number
            num /= 10;
        }
        
        // Check if it's Armstrong
        if (sum == originalNum)
         {
            System.out.println(originalNum + " is an Armstrong number.");
         } 
        else 
        {
            System.out.println(originalNum + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
