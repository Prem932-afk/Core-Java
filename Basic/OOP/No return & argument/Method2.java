
import java.util.*;

class A
{   
     void add(int a, int b)
     {
        int c=a+b;
        System.out.println(c);
     }
}
class B
{
     void sub(int a,int b)
     {
        int c=a-b;
        System.out.println(c);
     }
}
class c
{
     void mul(int a,int b)
     {
        int c=a*b;
        System.out.println(c);
     }
}
class D
{
     void div(int a,int b)
     {
        int c=a/b;
        System.out.println(c);
     }
}

     class Method2{
        public static void main(String[] args) 
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter first Number :");
            int a=sc.nextInt();
            System.out.print("Enter second Number");
            int b=sc.nextInt();
            A p =new A();
            p.add(a,b);
            B p2=new B();
            p2.sub(a,b);
            c p3=new c();
            p3.mul(a,b);
            D p4=new D();
            p4.div(a, b);

        }

    }
    
