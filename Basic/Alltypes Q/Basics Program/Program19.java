
import java.util.Scanner;

public class Program19
{
  public static void main(String[] args) 
  {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter ther frist Number :");
        int a=sc.nextInt();
        System.out.println("Enter the Second Number :");
        int b=sc.nextInt();
        if(a>b)
        {
            System.out.println("First Number is Maximum");
        }
        else
        {
            System.out.println("Second Number is Maxium");
        }
        sc.close();
  }    
}
//Write a java program to find Maximum two Number ?