
import java.util.Scanner;

public class UppercaseorLowercase 
{
    public static void main(String[] args) 
    {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        // Check if the character is an uppercase alphabet
        if (Character.isUpperCase(ch))// (ch=='A' && ch=='Z')
         {
            System.out.println(ch + " is an uppercase alphabet.");
         }
        // Check if the character is a lowercase alphabet
        else if (Character.isLowerCase(ch)) //(ch=='a' && ch=='z')
        {
            System.out.println(ch + " is a lowercase alphabet.");
        } 
        else 
        {
            System.out.println(ch + " is not an alphabet.");
        }
        
        // Close the scanner
        scanner.close();
    }
}

//.Write a C program to check whether a character is uppercase or lowercase alphabet.
