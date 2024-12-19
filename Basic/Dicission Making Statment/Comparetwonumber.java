import java.util.*;
class Comparetwonumber
{
  public static void main(String args[])
  {
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your first number");
    a=sc.nextInt();
    System.out.println("Enter your second number");
    b=sc.nextInt();
    if(a>b)
    {
        System.out.println("A Number is Greator");
    }
    else
    {
         System.out.println("B Number is Greator");
    }
    sc.close();
  }

    
}
