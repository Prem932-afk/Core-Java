//Q.1 ADD, SUM, DIV, MUL no return & no argument.

import java.util.Scanner;
class P1
{
  public static void main(String[] args) 
  {
      Calculate c=new Calculate();
       c.add();
       c.sub();
       c.div();
       c.mul();
  }
}
class Calculate
{
    void add()
    {
        System.out.println("Additon number");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int firstnumber=sc.nextInt();

        System.out.println("Enter second number");
        int secondnumber=sc.nextInt();

        int add=firstnumber + secondnumber;
        System.out.println("Addition : "+add);
    }
    

    void mul()
    {
        System.out.println("Multiple Number");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int firstnumber=sc.nextInt();

        System.out.println("Enter second number");
        int secondnumber=sc.nextInt();
        
        int mul=firstnumber * secondnumber;
        System.out.println("Multiplication : "+mul);
    }

    
    void sub()
    {
        System.out.println("Substractin Number");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int firstnumber=sc.nextInt();

        System.out.println("Enter second number");
        int secondnumber=sc.nextInt();
        
        int sub=firstnumber - secondnumber;
        System.out.println("Substraction : "+sub);
    }

    
    void div()
    {
        System.out.println("Divison Number");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int firstnumber=sc.nextInt();

        System.out.println("Enter second number");
        int secondnumber=sc.nextInt();
        
        int div=firstnumber / secondnumber;
        System.out.println("Division : "+div);
    }
}