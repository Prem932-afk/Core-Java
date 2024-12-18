import java.util.Scanner;
class Method1
{
    public static void main(String[] args) {
       A p=new A();
       p.show();
       B p1=new B();
       p1.show();
       C p2=new C();
       p2.show();
        
    }
}
class A
{
    int show()
    {
        int a=1;
        int b=2;
        int c=a+b;
        System.out.println(c);
        return c;
    }
}
class B
{
    float show()
    {
        int a=1;
        int b=6;
        float c=a+b;
        System.out.println(c);
        return c;
    }
}
class C
{
    char show()
    {
        char a='A';
       
        System.out.println(a);
        return a;
    }
}