
//Q.3
// A :
// 	method one
// B:
// 	method one
// C:
// 	method three
// D:
// 	method four

class A3
{
   public static void main(String[] args) 
   {
       A a = new A();
        a.Method1();
       B b = new B();
        b.Method2();
       C c = new C();
        c.Method3();
       D d = new D();
        d.Method4();  
   } 
}
class A
{
    void Method1()
    {
        System.out.println("Method 1");
    }
}

class B
{
    void Method2()
    {
        System.out.println("Method 2");
    }
}

class C
{
    void Method3()
    {
        System.out.println("Method 3");
    }
}

class D
{
    void Method4()
    {
        System.out.println("Method 4");
    }
}