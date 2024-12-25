public class Method17 {
    public static void main(String[] args) {
        new B();
        new C();
        new D();
        
    }
}
class A{
    A()
    {
        System.out.println("construcure 1");
    }
}
class B extends A{
    B()
    {
        System.out.println("construcure 2");
    }
}
class C extends A{
    C()
    {
        System.out.println("construcure 3");
    }
}
class D extends A{
    D()
    {
        System.out.println("construcure 4");
    }
}