import java.util.Scanner;
class Celsiutofahrenheit
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter termpretor in Celsius :");
       double celsius=sc.nextDouble();
       
       double fahrenheit=1.8*celsius+32;
       System.out.println("Celsius to Fahrenheit :"+fahrenheit);
       sc.close();
    }
}