// /8.Write a Java  program to enter temperature in Celsius and convert it into Fahrenheit ?
 
import java.util.Scanner;
public class P8 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your tempretor in celcius :");
        double celcius=sc.nextDouble();
        //°F = (°C × 9/5) + 32
        double fahrenheit=(celcius*9/5)+32;
        System.out.println(fahrenheit);
        
    }
}
//Write a java program to enter temperature in Celsius and convert it into Fahrenheit
//°F = (°C × 9/5) + 32
