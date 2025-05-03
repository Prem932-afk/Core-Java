 //Q.2
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

import javax.sound.sampled.SourceDataLine;
class A2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int a=sc.nextInt();
        System.out.println("Enter your Second number");
        int b=sc.nextInt();
        
        A e=new A();
        e.add(a,b);
        e.sub(a,b);
        e.div(a,b);
        e.mul(a,b);

        B f =new B();
         f.Even();
        
        C g = new C();
         g.Odd();
    }
}

class A 
{
     void add(int a, int b)
     {
        System.out.println("Number addition :"+(a+b));
     }

     void sub(int a, int b)
     {
        System.out.println("Number subtraction :"+(a-b));
     }

     void div(int a, int b)
     {
        System.out.println("Number divison :"+(a/b));
     }

     void mul(int a, int b)
     {
        System.out.println("Number Multiplication :"+(a*b));
     }
}

class B
{
    void Even()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your  number");
        int n = sc.nextInt();
        if(n%2==0)
        {
            System.out.println("Number is Even");
        }
    }

}


class C
{
    void Odd()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your  number");
        int n = sc.nextInt();
        if(n%2!=0)
        {
            System.out.println("Number is Odd");
        }
    }

}