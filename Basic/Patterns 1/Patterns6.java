import java.util.Scanner;
class Patterns6 
{
  public static void main(String[] args) {
    for (int i = 5; i >= 1; i--) 
    {
        // Print the number 'i' five times on the same line
        for (int j = 1; j <= 5; j++) 
        {
            System.out.print(i);
        }
        // Move to the next line after printing each row
        System.out.println(" ");
  }    
}
}
