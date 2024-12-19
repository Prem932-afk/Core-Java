import java.util.Scanner;
public class Calculater 
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter you choise :");
    String s=sc.nextLine();
   
    if(s.equals("Adittion"))
    {
               System.out.println("Enter first Number :");
               int a=sc.nextInt();
               System.out.println("Enter secon Number");
               int b=sc.nextInt();
               int add=a+b;
               System.out.println("Your value :"+add);
    }
    else if(s.equals("Substraction"))
    {
               System.out.println("Enter first Number :");
               int a=sc.nextInt();
               System.out.println("Enter secon Number");
               int b=sc.nextInt();
               int sub=a-b;
               System.out.println("Your value :"+sub);
    }
    else if(s.equals("Multiple"))
    {
               System.out.println("Enter first Number :");
               int a=sc.nextInt();
               System.out.println("Enter secon Number");
               int b=sc.nextInt();
               int mul=a*b;
               System.out.println("Your value :"+mul);
    }
    else if(s.equals("Divison"))
    {
               System.out.println("Enter first Number :");
               int a=sc.nextInt();
               System.out.println("Enter secon Number");
               int b=sc.nextInt();
               int div=a/b;
               System.out.println("Your value :"+div);
    }
    else
    {
        System.out.println("Input not matched : sorry!");
    }
    sc.close();
  }   
}
