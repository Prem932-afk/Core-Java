public class method16 {
    
    public static void main(String[] args) {
        C c=new C();
        c.method();
        c.show();
        c.another();
       
    }
}
abstract class A
{
    abstract void show();
    private void display()
    {
        System.out.println("Non-Abstract method");
    }
    void another()
    {
        display();
    }
}

class B extends A
{
    void show()
    {
        System.out.println("abstract method");
    }
    protected void show2()
    {
        System.out.println("proctected method class B");
    }
    private void show3()
    {
        System.out.println("private method class B");
    }
    void another()
    {
        show3();
    }
}
class C extends B
{
     void method()
     {
       super.show();
     }
}