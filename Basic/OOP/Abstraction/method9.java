public class method9 {
    public static void main(String[] args) {
        B b=new B();
        b.method2();
    }
}
abstract class A
{
    private void show()
    {
         System.out.println("show method");
    }
    protected void display()
    {
         System.out.println("display method");
    }
    //abstract private void  method1();

    abstract protected void method2();
}
class B extends A
{
        protected void method2()
        {
            System.out.println("protected method");
        }
        
}
