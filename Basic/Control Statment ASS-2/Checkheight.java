// import java.util.Scanner;
// class Checkheight
// {
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         float cm;
//         System.out.println("Enter your height in CM");
//         cm=sc.nextFloat();
//         float height=cm*100;
//         System.out.println("Your height :"+height);
//     }
// }
import java.util.Scanner;

public class Checkheight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for their height in meters
        System.out.print("Enter your height in meters (e.g., 1.75): ");
        double heightInMeters = sc.nextDouble();

        // Convert meters to centimeters
        double heightInCm = heightInMeters * 100;

        // Output the result
        System.out.println("Your height in centimeters is: " + heightInCm);

        
    }
}
