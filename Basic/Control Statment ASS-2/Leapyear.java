import java.util.Scanner;
class Leapyear
{
 public static void main(String[] args) {
    int year;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your year");
    year=sc.nextInt();
    if(year%4==0 && year%400!=0 || year%100==0)
    {
          System.out.println("This is leap year");
    }
    else
    {
        System.out.println("Not leap year");
    }
 }
}
