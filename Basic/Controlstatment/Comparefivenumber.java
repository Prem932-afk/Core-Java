
import java.util.*;
class Comparefivenumber
{
  public static void main(String args[])
  {
    int a,b,c,d,e;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your first number");
    a=sc.nextInt();
    System.out.println("Enter your second number");
    b=sc.nextInt();
    System.out.println("Enter your third number");
    c=sc.nextInt();
    System.out.println("Enter your forth number");
    d=sc.nextInt();
    System.out.println("Enter your fiveth number");
    e=sc.nextInt();
    if(a>b && a>c && a>d && a>e)
    {
        System.out.println("A Number is Greator");
    }
    else if(b>a && b>c && b>e && b>d)
    {
         System.out.println("B Number is Greator");
    }
    else if(c>a & c>b && c>d && c>e)
    {
      System.out.println("C Number is Greator");
    }
    else if(d>a & d>b && d>c && d>e)
    {
      System.out.println("D Number is Greator");
    }
    else if(e>a & e>b && e>c && e>d)
    {
      System.out.println("E Number is Greator");
    }
    else
    {
        System.out.println("Input not matched");
    }
  }
}

    
