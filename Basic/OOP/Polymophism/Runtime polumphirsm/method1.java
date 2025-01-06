class method1
{
 public static void main(String[] args) {
    B b=new B();
    b.method2();
    b.method1();
 }
}
class A
{
               void method1()
               {
                System.out.println("first method");
               }
}
class B extends A
{
    void method2()
    {
     System.out.println("second method");
    }
}