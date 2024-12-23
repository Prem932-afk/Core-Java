import java.util.Scanner;
class Method4 {
    public static void main(String[] args) {
        A a=new A();
          a.add();
          a.sub();
          a.div();
          a.mul();
        B b=new B();
          b.even();
        C c=new C();
          c.odd();
          
        
    }
}

class A
{
    void add()
    {
        System.out.println("Additon number !");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter firs number:");
        int a=sc.nextInt();
        System.out.println("Enter second number :");
        int b=sc.nextInt();
        int add =a+b;
        System.out.println("Addition :"+add);
        
    }
    void sub()
    {
        System.out.println("Sustraction number !");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter firs number:");
        int a=sc.nextInt();
        System.out.println("Enter second number :");
        int b=sc.nextInt();
        int sub =a-b;
        System.out.println("Substraction :"+sub);
      
    }
    void div()
    {
        System.out.println("Divison number !");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter firs number:");
        int a=sc.nextInt();
        System.out.println("Enter second number :");
        int b=sc.nextInt();
        int div =a/b;
        System.out.println("Division :" +div);
        
    }
    void mul()
    {
        System.out.println("Multiple number !");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter firs number:");
        int a=sc.nextInt();
        System.out.println("Enter second number :");
        int b=sc.nextInt();
        int mul =a*b;
        System.out.println("Mulitple :"+mul);
       
    }
}
class B
{
        void even()
        {
            System.out.println("check number is even ? ");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your number :");
            int n=sc.nextInt();
            if(n%2==0)
            {
                System.out.println("Number is even");
            }
           
        }
}
class C
{
        void odd()
        {
            System.out.println("check number is odd ? ");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your number :");
            int n=sc.nextInt();
            if(n%2!=0)
            {
                System.out.println("Number is odd");
            }
           
        }
        
}
