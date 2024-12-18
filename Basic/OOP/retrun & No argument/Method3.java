import java.util.Scanner;
class Method3 
{
  public static void main(String[] args)
 {
    
   A p=new A();
   p.add();
   p.mul();
   p.sub();
   p.div();
   B p1=new B();
   p1.even();
   C p2=new C();
   p2.odd();
  }    
}
class A
{

    int add()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        int c= a+b;
        System.out.println(c);
        return c;
        
    }
    int mul()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        int c= a*b;
        System.out.println(c);
        return c;
        
    }
    int div()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        int c= a/b;
        System.out.println(c);
        return c;
        
    }
    int sub()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        int c= a-b;
        System.out.println(c);
        return c;
        
    }
}
class B
{
       int even()
       {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter your number");
          int n=sc.nextInt();
          if(n%2==0)
          {
            System.out.println("Even number");
          }
         
          return n;
       }
}
class C
{
       int odd()
       {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter your number");
          int n=sc.nextInt();
          if(n%2!=0)
          {
            System.out.println("Odd number");
          }
          
          return n;
       }
}

