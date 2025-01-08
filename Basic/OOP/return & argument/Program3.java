public class Program3 
{
  public static void main(String[] args) 
  {
       A a=new A();
        a.show(1);

       B b=new B();
        b.show2(2);

       C c=new C();
        c.show3(3);
        c.show4(4);
        c.show5(5);

       D d=new D();
        d.show6(6);
        d.show7(7);
        d.show8(8);
        d.show9(9);
  }    
}
class A
{
      int show(int n)
      {
        System.out.println(n);
        return n;
      }
}
class B
{
    int show2(int n)
    {
      System.out.println(n);
      return n;
    }
}
class C 
{
    int show3(int n)
    {
      System.out.println(n);
      return n;
    }

    int show4(int n)
    {
      System.out.println(n);
      return n;
    }

    int show5(int n)
    {
      System.out.println(n);
      return n;
    }

}

class D
{
    int show6(int n)
    {
      System.out.println(n);
      return n;
    }

    int show7(int n)
    {
      System.out.println(n);
      return n;
    }

    int show8(int n)
    {
      System.out.println(n);
      return n;
    }

    int show9(int n)
    {
      System.out.println(n);
      return n;
    }
}

// A :
// 	method one 
// B:
// 	method one 
// C:
// 	method three
// D:
// 	method four  
