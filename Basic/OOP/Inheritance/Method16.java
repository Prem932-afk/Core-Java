class A{
      void show()
      {
        System.out.println("Show 1");
      }
}
class B extends A{
    int  show2()
    {
        int a=89;
        System.out.println(a);
        return a;
    }
}
class C extends A{
    int show3(int a)
    {
        System.out.println(a);
        return a;
    }
}
class D extends A{
    void show4(int a)
    {
        System.out.println(a);
    }
}
class E extends A{
    int a;
    E show5()
    {
        System.out.println(a);
        return this;
    }
}
class Method16
{
    public static void main(String[] args) {
        B b=new B();
        b.show();
        b.show2();
        C c=new C();
        c.show();
        c.show3(10);
        D d=new D();
        d.show4(55);
        E e=new E();
        e.show5();

    }
}