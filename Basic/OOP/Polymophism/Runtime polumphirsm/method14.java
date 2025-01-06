public class method14 {
    public static void main(String[] args) {
        new B(22);
    }
}
class A
{
    A(int a)
    {
        System.out.println("A :"+a);
    }
    
}
class B extends A
{
    B(int b)
    {
        super(33);
        System.out.println("B :"+b);
    }
}