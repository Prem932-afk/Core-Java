import java.util.Scanner;

public class TicketBookingSystem {
    public static void main(String[] args) {
        // Create a Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Set base ticket price
        final double baseTicketPrice = 15.0;

        // Prompt user for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        double finalprice=0;
        if (age < 12) 
        {
            // Children get a 50% discount
            finalprice=baseTicketPrice*0.5;
            System.out.println("Your final price : "+ finalprice);
        } 
        else if (age >= 65) 
        {
            // Seniors get a 30% discount
            finalprice=baseTicketPrice*0.30;
            System.out.println("Your final price : "+ finalprice);
        } 
        else
         {
            // No discount for other ages
          
            System.out.println("No  Discount !! ");
        }
    }
}

