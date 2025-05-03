// Q.1
// A :
// 	method one
// B:
// 	method one
// C:
// 	method three
// D:
// 	method four

class A1
{
    public static void main(String[] args) 
    {
        A a = new A();
         a.method1(1);
        B b = new B();
         b.method2(2);
        C c = new C();
         c.method3(3);
        D d = new D();
         d.method4(4); 
    }
}

class A
{
    void method1(int a)
    {
        System.out.println("A value :"+a);
    }
}

class B
{
    void method2(int b)
    {
        System.out.println("aba value :"+b);
    }
}

class C
{
    void method3(int c)
    {
        System.out.println("C value :"+c);
    }
}

class D
{
    void method4(int d)
    {
        System.out.println("D value :"+D);
    }
}