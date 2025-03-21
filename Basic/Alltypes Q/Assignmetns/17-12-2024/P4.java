
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




import java.util.*;
public class P4
{
    public static void main(String args[])
    {
           A a=new A();
            a.add();;
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
    void add()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Addition Number");
        System.out.println("Enter your number:" );
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Your Addition Number :" + c);
    }

    void sub()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Substraction Number");
        System.out.println("Enter your number:" );
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a-b;
        System.out.println("Your Substraction Number :" + c);
    }

    void mul()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Multiple Number");
        System.out.println("Enter your number:" );
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a*b;
        System.out.println("Your Multiple Number :" + c);
    }

    void div()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Divison Number");
        System.out.println("Enter your number:" );
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a/b;
        System.out.println("Your Division Number :" + c);
    }
}
class B
{
    void even()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number :");
        int n=sc.nextInt();

        if(n%2==0)
        {
            System.out.println("Even Number");
        }
    }
}
class C
{
    void odd()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number :");
        int n=sc.nextInt();

        if(n%2==0)
        {
            System.out.println("Odd Number");
        }
    }
}