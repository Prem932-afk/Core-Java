import java.util.Scanner;

public class EvenOddType1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your types");
        int types;
        types=scanner.nextInt();

        // Prompt the user to enter a number
        if(types==1)
         {
            System.out.print("Enter a number to check if it's even or odd: ");
            int number = scanner.nextInt();
    
            // Determine if number is even or odd
            switch (number % 2) {
                case 0:
                    System.out.println("1 Even number");
                    break;
                case 1:
                    System.out.println("2 Odd number");
                    break;
                default:
                    System.out.println("Unexpected case.");
                    break;
            }
    
         }
         else if(types==2)
         {
            System.out.print("Enter 'e' for even number or 'o' for odd number: ");
            char choice = scanner.next().charAt(0);
    
            // Switch to determine even or odd
            switch (Character.toLowerCase(choice)) {
                case 'e':
                    System.out.println("Even number");
                    break;
                case 'o':
                    System.out.println("Odd number");
                    break;
                default:
                    System.out.println("Invalid input. Please enter 'e' or 'o'.");
                    break;
            }
         }
         else
         {
            System.out.println("Input not matched");
         }
    }
}
