// Q.23 Write a java program to check whether a number is even or odd ?

 
import java.util.Scanner;
public class P23
{
    public static void main(String[] args) 
    {
       
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();  
        
       
        if (number % 2 == 0) 
        {
            System.out.println("The number is even.");
        } 
        else 
        {
            System.out.println("The number is odd.");
        }
        
        
        scanner.close();
    }
}

//Write a java program to check whether a number is even or odd. 

