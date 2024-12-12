
import java.util.Scanner;
class Maxten
{
  public static void main(String args[])
  {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your number");
    n=sc.nextInt();
    if(n>=10)
    {
        System.out.println("Number is maximum of 10");
    }
    else
    {
         System.out.println("Numbe is minimum of 10;");
    }
  }

}