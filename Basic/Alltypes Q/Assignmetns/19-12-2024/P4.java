
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
public class P4 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number");
        int x=sc.nextInt();
        int y=sc.nextInt();

        A a=new A();
         a.add(x,y);
         a.sub(x, y);
         a.mul(x, y);
         a.div(x, y);
         System.out.println("Now check Number is even or odd !!");

         System.out.println("Enter your Number");
         int z=sc.nextInt();

        B b=new B();
         b.even(z);

        C c=new C();
         c.odd(z);
         
        
    
    }    
}

class A
{
     int add(int a, int b)
     {
         int c=a+b;
         System.out.println("Addition : "+c);
         return c;
     }

     int sub(int a, int b)
     {
         int c=a-b;
         System.out.println("Substraction : "+c);
         return c;
     }

     int mul(int a, int b)
     {
         int c=a*b;
         System.out.println("Multiple : "+c);
         return c;
     }

     int div(int a, int b)
     {
         int c=a/b;
         System.out.println("Division : "+c);
         return c;
     }
}
class B
{
    int even(int n)
    {
        
        System.out.println("Even : "+n);
        return n;
    }
}
class C
{
    int odd(int n)
    {
        
        System.out.println("Odd : "+n);
        return n;
    }
}
