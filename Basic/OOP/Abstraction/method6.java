public class method6 
{

    public static void main(String[] args) 
    {
        A a=new B();
        a.display(9);
        a.show(8);
    }
}
abstract class A
{
    abstract void show(int a);

    abstract int display(int a);
}
class B extends A
{
    void show(int a)
    {
        System.out.println("method call :"+a);
    }
    int display(int a)
    {
        System.out.println("a :"+a);
        return a;
    }
}

