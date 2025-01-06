public class method2 
{
 public static void main(String[] args) {
    B b=new B();
    b.method();
  
 }
}
class A
{
               void method()
               {
                System.out.println("first method");
               }
}
class B extends A
{
    void method()
    {
        super.method();
         System.out.println("second method");
    }
}