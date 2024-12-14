import java.util.Scanner;
class Patterns1
{
    public static void main(String[] args) {
        
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5;j++)
        {
            System.out.print("*");
        }
        System.out.println(" ");
    }
}
}
/*
 public class AsteriskPattern {
    public static void main(String[] args) {
        int i = 0; // Outer loop counter for rows

        while (i < 4) { // Loop for each of the 4 rows
            int j = 0; // Inner loop counter for columns
            while (j < 4) { // Loop for 4 columns in each row
                System.out.print("*"); // Print a single asterisk without a newline
                j++;
            }
            System.out.println(); // Move to the next line after each row
            i++;
        }
    }
}

 */