import java.util.Scanner;
class A
{

    int add()
    { 
       System.out.println("Addtion Operation !");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        int c= a+b;
        System.out.println("Adition value"+c);
        return c;
        
    }
    int mul()
    {
        System.out.println("Multiplixaion Operation !");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        int c= a*b;
        System.out.println("Multiple value : "+c);
        return c;
        
    }
    int div()
    {
       System.out.println("Division Operation !");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        int c= a/b;
        System.out.println("division value"+c);
        return c;
        
    }
    int sub()
    {
       System.out.println("Substraction Operation !");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        int c= a-b;
        System.out.println("substraction value"+c);
        return c;
        
    }
}
class B
{
       int even()
       {
          System.out.println("Now check even number or not !");
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
          System.out.println("Now check odd number or not !");
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
class Method3 
{
  public static void main(String[] args)
 {
    
   A p=new A();
   System.out.println( p.add());
   System.out.println(p.mul());
   System.out.println(  p.sub());
   System.out.println(p.div());

   B p1=new B();
   System.out.println( p1.even());
   
   C p2=new C();
   System.out.println(p2.odd());
   
  
  }    
}

