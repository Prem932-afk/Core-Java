import java.util.Scanner;

public class TicketBookingSystem 
{
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);

        // Base ticket price
        final double ticketPrice = 10.0;

        // Ask the user for age
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        double finalPrice;

        // Calculate the ticket price based on age
        if (age < 12)
         {
            // Children get 50% discount
            finalPrice = ticketPrice * 0.5;
            System.out.println("You are eligible for a 50% child discount.");
        } 
        else if (age >= 65) 
        {
            // Seniors get 30% discount
            finalPrice = ticketPrice * 0.7;
            System.out.println("You are eligible for a 30% senior discount.");
        } 
        else
         {
            // No discount
            finalPrice = ticketPrice;
            System.out.println("No discount applicable.");
         }

        // Display the final ticket price
        System.out.printf("The final ticket price is: $%.2f%n", finalPrice);

      
    }
}
