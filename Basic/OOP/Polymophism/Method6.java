public class Method6 {
 public static void main(String args[])
 {
    new A();
    new A(8);
 }   
}
class A
{
    A(int a)
    {
        System.out.println(a);
    }
    A()
    {
        System.out.println("Constructor withoyt arguments");
    }
}
