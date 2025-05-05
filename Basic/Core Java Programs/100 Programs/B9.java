 
import java.util.Scanner;
public class B9
{
 
     public static void main(String[] args) 
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your tempretor in  Fahernheit :");
        double fahrenheit=sc.nextDouble();
        //°F = (°C × 9/5) + 32
        double celcius=(fahrenheit-32)*5/9;
        System.out.println(celcius);
     }
}
//Write a Java program to enter temperature in Fahrenheit and convert to Celsius.
 //°F = (°C × 9/5) + 32