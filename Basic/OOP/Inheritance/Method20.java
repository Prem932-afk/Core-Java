
public class Method20 {
    public static void main(String[] args) {
        
    
    B b=new B();
    b.show();
    b.show2();

    C c=new C();
    c.show();
    c.show3();
    
    D d=new D();
    d.show();
    d.show4();
    }
}
class A{
    int a;
    int b;
    int c;
    int d;
    void show()
    {
        System.out.println("show ");
         
    }
}
class B extends A{
      void show2(){
           this.c=c=30;
           this.d=d=40;
           System.out.println(c);
           System.out.println(d);
    }
}
class C extends A{
    void show3(){
        this.a=a=30;
        this.b=b=40;
        System.out.println(a);
        System.out.println(b);
 }
}
class D extends A{
    void show4()
    {
          this.a=a;
           System.out.println(a);

    }
}