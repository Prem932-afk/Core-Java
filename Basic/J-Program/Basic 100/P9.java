 //Q.9 Write a Java program to enter temperature in Fahrenheit and convert to Celsius.
import java.util.Scanner;
public class P9
{
 
     public static void main(String[] args) 
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your tempretor in  Fahernheit :");
        double fahrenheit=sc.nextDouble();
        double celcius=(fahrenheit-32)*5/9;
        System.out.println(celcius);
     }
}

 //°F = (°C × 9/5) + 32