
// A :
// 	method1 :
// 	method2 :


public class P2
{
    public static void main(String[] args)
	{
        A a=new A();
         a.method1();
         a.method2();
    }
}
class A
{
    void method1()
    {
        System.out.println("Method 1");
    }

    void method2()
    {
        System.out.println("Method 2");
    }
}
