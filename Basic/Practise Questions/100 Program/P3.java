
import java.util.Scanner;
    public class P3
    {
      public static void main(String[] args) 
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you choise :");
        String s=sc.nextLine();
       
        if(s.equals("Adittion"))
        {
                   System.out.print("Enter first Number :");
                   int a=sc.nextInt();
                   System.out.print("Enter secon Number");
                   int b=sc.nextInt();
                   int add=a+b;
                   System.out.println("Your value :"+add);
        }

        else if(s.equals("Substraction"))
        {
                   System.out.print("Enter first Number :");
                   int a=sc.nextInt();
                   System.out.print("Enter secon Number");
                   int b=sc.nextInt();
                   int sub=a-b;
                   System.out.println("Your value :"+sub);
        }

        else if(s.equals("Multiple"))
        {
                   System.out.print("Enter first Number :");
                   int a=sc.nextInt();
                   System.out.print("Enter secon Number");
                   int b=sc.nextInt();
                   int mul=a*b;
                   System.out.println("Your value :"+mul);
        }

        else if(s.equals("Divison"))
        {
                   System.out.print("Enter first Number :");
                   int a=sc.nextInt();
                   System.out.print("Enter secon Number");
                   int b=sc.nextInt();
                   int div=a/b;
                   System.out.println("Your value :"+div);
        }

        else
        {
            System.out.print("Input not matched : sorry!");
        }
        sc.close();
      }   
    }