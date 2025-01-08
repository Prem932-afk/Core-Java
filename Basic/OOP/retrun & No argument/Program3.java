public class Program3 
{
  public static void main(String[] args) 
  {
     A a=new A();
      a.mehtod1();

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
     String mehtod1()
     {
        String name="Mehtod 1";
        System.out.println(name);
        return name;
     }
}

class B
{
      int method2()
      {
         int n;
         System.out.println(n);
         return n
      }
}

class C
{
       float method3()
       {
           float a=1.1f;
           System.out.println(a);
           return a;
       }

       float method4()
       {
           float a=1.2f;
           System.out.println(a);
           return a;
       }
       float method5()
       {
           float a=1.3f;
           System.out.println(a);
           return a;
       }

}
class D
{
      double method6()
      {  
            double a=2.1d;
            System.out.println(a);
            return a;
      }

      double method7()
      {  
            double a=2.2d;
            System.out.println(a);
            return a;
      }

      double method8()
      {  
            double a=2.3d;
            System.out.println(a);
            return a;
      }

      double method9()
      {  
            double a=2.4d;
            System.out.println(a);
            return a;
      }
}


// A :
// 	method one 
// B:
// 	method one 
// C:
// 	method three
// D:
// 	method four  
