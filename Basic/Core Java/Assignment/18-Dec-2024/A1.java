
 
 
 
// A :
// method one
// B:
// method one
// C:
// method three
// D:
// method four


public class A1 
{
public static void main(String[] args) 
{
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
    d.method9(9);
}  
}
class A
{
  void method1(int a)
  {
      System.out.println("A :"+a);
  }
}
class B
{
   void method2(int a)
   {
    System.out.println("A :"+a); 
   }
}
class C
{
   void method3(int a)
   {
     System.out.println("A :"+a);
   }

   void method4(int a)
   {
     System.out.println("A :"+a);
   }

   void method5(int a)
   {
     System.out.println("A :"+a);
   }
     
}
class D
{
   void method6(int a)
   {
     System.out.println("A :"+a);
   }

   void method7(int a)
   {
    System.out.println("A :"+a);
   }

   void method8(int a)
   {
    System.out.println("A :"+a);
   }

   void method9(int a)
   {
    System.out.println("A :"+a);
   }
}