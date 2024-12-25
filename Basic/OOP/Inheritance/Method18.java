public class Method18{
    public static void main(String[] args) {
        B b=new B();
        b.show(88);
        b.show2(89);
        System.out.println(b.getA());
        System.out.println(b.getB());
        C c=new C();
        c.show(12);
        c.show3(34);
        System.out.println(c.getA());
        System.out.println(c.getC());
        D d=new D();
        d.show(11);
        d.show4(94);
        System.out.println(d.getA());
        System.out.println(d.getD());



        
    }
}
class A{
     private int a;
     void show(int a)
    {
        this.a=a;
        System.out.println(a);
    }
     int getA() {
        return a;
    }
}
class B extends A{
    private int b;
    void show2(int b)
    {
        this.b=b;
        System.out.println(b);
    }
    int getB()
    {
        return b;
    }
}
class C extends A{
   private int c;
    void show3(int c)
    {
        this.c=c;
        System.out.println(c);
    }
    int getC() {
        return c;
    }
}
class D extends A{
    private int d;
    void show4(int d)
    {
        this.d=d;
        System.out.println("construcure 4");
    }
    int getD()
    {
        return d;
    }

}
