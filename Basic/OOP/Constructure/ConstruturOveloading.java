public class ConstruturOveloading 
{
    public static void main(String[] args) {
        new A();
        new A(3);
    }
}
class A
{
    A()
    {
        System.out.println("Cons-1");
    }
    A(int a)
    {
        System.out.println("a :"+a);
    }
}
