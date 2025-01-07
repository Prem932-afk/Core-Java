public class method5 {
    public static void main(String[] args) {
        A a=new B();
        a.display();
        a.show();
    }
}
abstract class A
{
    abstract void show();

    abstract int display();
}
class B extends A
{
    void show()
    {
        System.out.println("method call");
    }
    int display()
    {
        System.out.println("8");
        return 8;
    }
}
