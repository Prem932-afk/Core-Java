import java.util.Scanner;

public class TimeOfDayGreeting 
{
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);

        // Ask user for time of day
        System.out.print("Please enter the time of day (morning, afternoon, evening): ");
        String timeOfDay = scanner.nextLine().trim().toLowerCase();

        // Respond based on user input
        if (timeOfDay.equals("morning")) 
        {
            System.out.println("Good morning!");
        } 
        else if (timeOfDay.equals("afternoon")) 
        {
            System.out.println("Good afternoon!");
        }
         else if (timeOfDay.equals("evening")) 
         {
            System.out.println("Good evening!");
        } 
        else 
        {
            System.out.println("Invalid input. Please enter 'morning', 'afternoon', or 'evening'.");
        }

        
    }
}
