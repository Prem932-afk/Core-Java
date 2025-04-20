//Q.3

// A :
// 	method one
// B:
// 	method one
// C:
// 	method three
// D:
// 	method four



public class A3
{
 public static void main(String[] args)
 {
     A a=new A();
      a.method1();

     B b=new B();
      b.method2();

     C c=new C();
      c.method3();
      c.method4();
      c.method5();

     D d=new D();
      d.method6();
      d.method7();
      d.method8();
      d.method9();
 }
}
class A
{
    void method1()
    {
        System.out.println("Method 1");
    }
}
class B
{
    void method2()
    {
        System.out.println("Method 2");
    }
}
class C
{
    void method3()
    {
        System.out.println("Method 3");
    }

    void method4()
    {
        System.out.println("Mehtod4");
    }
    void method5()
    {
        System.out.println("Method 5");
    }

}
class D
{
    void method6()
    {
        System.out.println("Method 6");
    }

    void method7()
    {
        System.out.println("Mehtod 7");
    }
    void method8()
    {
        System.out.println("Method 8");
    }
    void method9()
    {
        System.out.println("Method 9");
    }
}
