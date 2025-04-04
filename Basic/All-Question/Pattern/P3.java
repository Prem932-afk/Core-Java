import java.util.Scanner;
class P3
{
     
    public static void main(String[] args) 
    {
        int n=5;
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=(n-i)+1; j++)
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
        int i = 3; // Start at the first row with 3 asterisks

        while (i >= 1) { // Loop for each row
            int j = 1; // Inner loop counter
            while (j <= i) { // Print 'i' number of asterisks
                System.out.print("*");
                j++;
            }
            System.out.println(); // Move to the next line after printing each row
            i--; // Decrease the number of asterisks for the next row
        }
    }
}
 */