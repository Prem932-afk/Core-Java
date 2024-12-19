import java.util.Scanner;
class Fahrenheitcelsius
{
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter termpretor in Fahrenheit :");
    double fahrenheit=sc.nextDouble();

    double Celsius=(fahrenheit-32)*5/9;
    System.out.println("Your tempretor : "+Celsius);
    }

}
