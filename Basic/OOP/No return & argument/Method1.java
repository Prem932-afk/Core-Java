public class Method1 {
    public static void main(String[] args) {
        A a=new A();
        a.method1(1);
        B b=new B();
        b.method2(2);
        C c=new C();
        c.method3(3);
        c.method4(4);
        c.method5(5);
        D d=new D();
        d.method6(6);
        d.method7(7);
        d.method8(8);
        d.method9(0);

        
    }
}

class A
{
         void method1(int a)
         {
            a=a;
            System.out.println("A value :"+a);
         }
}
class B
{
         void method2(int b)
         {
            b=b;
            System.out.println("B value :"+b);
         }
}
class C
{
         void method3(int c)
         {
            c=c;
            System.out.println("C value :"+c);
         }
         
         void method4(int d)
         {
            d=d;
            System.out.println("D value :"+d);
         }
         
         void method5(int e)
         {
            e=e;
            System.out.println("E value :"+e);
         }
}
class D
{
         void method6(int f)
         {
            f=f;
            System.out.println("F value :"+f);
         }
         void method7(int g)
         {
            g=g;
            System.out.println("G value :"+g);
         }
         void method8(int h)
         {
            h=h;
            System.out.println("H value :"+h);
         }
         void method9(int i)
         {
            i=i;
            System.out.println("I value :"+i);
         }
}
// no return and argument 
// A :
// 	method one 
// B:
// 	method one 
// C:
// 	method three
// D:
// 	method four 