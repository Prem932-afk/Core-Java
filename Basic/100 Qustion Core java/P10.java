//10. Write a Java program to convert days into years, weeks and days. ?




import java.util.Scanner;

public class P10 
{
   public static void main(String[] args) 
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter your day :");
      int totaldays=sc.nextInt();

      int year= totaldays/365;
      int remainingDaysAfterYears = totaldays%365;
      int weeks=remainingDaysAfterYears/7;
      int days=remainingDaysAfterYears%7;
     
      System.out.println("Year :"+year);
      System.out.println("remain day after year :"+remainingDaysAfterYears);
      System.out.println("weeks :"+weeks);
      System.out.println("days :"+days);
   }    
}
// Write a Java program to convert days into years, weeks and days.

