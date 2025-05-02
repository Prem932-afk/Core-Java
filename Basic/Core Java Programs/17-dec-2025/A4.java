//Q.4
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
public class A4 
{
  public static void main(String[] args) 
  {
    A a =new A();
     a.add();
     a.div();
     a.Mul();
     a.sub();
    B b = new B();
     b.Even();
    C c = new C();
     c.Odd();
  }    
}
class A
{
    void add()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Number");
        int a=sc.nextInt();
        System.out.println("Enter your Second Number");
        int b=sc.nextInt();
        int add=a+b;
        System.out.println("Your additional number :"+ add)  ;
    }

    void div()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Number");
        int a=sc.nextInt();
        System.out.println("Enter your Second Number");
        int b=sc.nextInt();
        int div=a/b;
        System.out.println("Your Divison number :"+ div);
    }

    void Mul()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Number");
        int a=sc.nextInt();
        System.out.println("Enter your Second Number");
        int b=sc.nextInt();
        int Mul=a*b;
        System.out.println("Your Multiple number :"+ Mul);  
    }

    void sub()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Number");
        int a=sc.nextInt();
        System.out.println("Enter your Second Number");
        int b=sc.nextInt();
        int sub=a-b;
        System.out.println("Your Sub number :"+ sub); 
    }
}

class B
{
    void Even()
    {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter your number");
     int n=sc.nextInt();
     if(n%2==0)
     {
        System.out.println("Even Number");
     }
     else
     {
        System.out.println("Not Even");
     }
    }
}

class C
{
    void Odd()
    {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter your number");
     int n=sc.nextInt();
     if(n%2==0)
     {
        System.out.println("Odd Number");
     }
     else
     {
        System.out.println("Not Odd");
     }
    }
}

