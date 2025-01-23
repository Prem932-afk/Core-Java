import java.util.Scanner;

public class ReverseNaturalNumbers 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();
 
        int i = n;
        
        
        while (i >= 1) 
        {
            System.out.println(i);
            i--; 
        }
        
       
        scanner.close();
    }
}
// Write a java program to print all natural numbers in reverse (from n to 1). - using while loop
