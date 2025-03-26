
// user input :

// class A:
// 	add()
// 	sub()
// 	div()
// 	multi()

// class B
// 	even()

// class C
// 	odd ()


import java.util.Scanner;
public class P6 
{
  public static void main(String[] args) 
  {
        A a=new A();
         a.add();
         a.sub();
         a.mul();
         a.div();

        B b=new B();
         b.even();

        C c=new C();
         c.odd();
  }    
}

class A
{
       int add()
       {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter your Number ");
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=a+b;
         System.out.println("Addition Number :"+c);
         return c;
       }

       int sub()
       {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter your Number ");
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=a-b;
         System.out.println("Addition Number :"+c);
         return c;
       }

       int mul()
       {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter your Number ");
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=a*b;
         System.out.println("Multiple Number :"+c);
         return c;
       }

       int div()
       {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter your Number ");
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=a/b;
         System.out.println("Divison Number :"+c);
         return c;
       }
}

class B
{
       int even()
       {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter your Number ");
         int n=sc.nextInt();

         if(n%2==0)
         {
           System.out.println("Even Number");
         }
         return n;
       }
}
class C
{
    int odd()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your Number ");
      int n=sc.nextInt();

      if(n%2==0)
      {
        System.out.println("Odd Number");
      }
      return n;
    }
}


