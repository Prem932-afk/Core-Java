//Q.2) Write a Java program to enter two numbers and find their sum.
import java.util.Scanner;
public class Program2 
{
  public static void main(String[] args) 
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter first number");
     int firstnumber=sc.nextInt();
     System.out.println("Enter second number");
     int secondnumber=sc.nextInt();
     
     int sum=firstnumber + secondnumber;
      System.out.println("Your sum Number is :"+sum);
  }    
}
