public class Method19 {
    public static void main(String[] args) {
        B b=new B();
        C c=new C();
        D d=new D();
    }
}
class A{
    A()
    {
        System.out.println("cons-1");
    }
}
class B extends A{
    B()
    {
        System.out.println("cons-2");
    }
}
class C extends A{
    C()
    {
        System.out.println("cons-3");
    }
}
class D extends A{
    D()
    {
        System.out.println("cons-4");
    }
}
