//27.Uppercase 

//27.Uppercase 
//27.Uppercase 

import java.util.Scanner;

public class P27 
{
    public static void main(String[] args) 
    {
        char ch;
        Scanner sc = new Scanner(System.in);

        // Correct way to read a single character
        ch = sc.next().charAt(0);  // Use 0 instead of 'ch'

        // Check if the character is uppercase
        if (ch >= 'A' && ch <= 'Z') 
        {
            ch = Character.toLowerCase(ch);  // Correct method is 'toLowerCase', not 'LowerCase'
        }

        System.out.println("Converted character: " + ch);
        sc.close();
    }
}
