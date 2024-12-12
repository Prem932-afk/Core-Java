
import java.util.*;
class Comparethreenumber
{
  public static void main(String args[])
  {
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your first number");
    a=sc.nextInt();
    System.out.println("Enter your second number");
    b=sc.nextInt();
    System.out.println("Enter your third number");
    c=sc.nextInt();
    if(a>b && a>c)
    {
        System.out.println("A Number is Greator");
    }
    else if(b>a && b>c)
    {
         System.out.println("B Number is Greator");
    }
    else
    {
      System.out.println("C Number is Greator");
    }
  }

    
}
