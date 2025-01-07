public class method14 {
    
    public static void main(String[] args) {
        C c=new C();
        c.method();
        c.show();
        c.display();
    }
}
abstract class A
{
    abstract void show();
    void display()
    {
        System.out.println("Non-Abstract method");
    }
}

class B extends A
{
    void show()
    {
        System.out.println("abstract method");
    }
}
class C extends B
{
     void method()
     {
       super.show();
     }
}