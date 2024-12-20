
class Method2
{
    public static void main(String[] args)
    {
        A p=new A();
        System.out.println(p.show(0));
        B p1=new B();
        System.out.println(p1.show(1));
        C p2=new C();
        System.out.println(p2.show(2,4));
    }
}
class A
{
     int show(int n)
     {
        if(n%2==0)
        {
            System.out.println("Even number");
        }
        return n;
     }
     
}
class B
{
     int show(int n)
     {
        if(n%2!=0)
        {
            System.out.println("Odd number");
        }
        return n;
     }
     
}
class C
{
     int show(int a,int b)
     {
       int x=a;
       int y=b;
       int c=x+y;
       System.out.println(c);
       return c;

     }
     int show1(int a,int b)
     {
       int x=a;
       int y=b;
       int c=x-y;
       System.out.println(c);
       return c;

     }
     int show2(int a,int b)
     {
       int x=a;
       int y=b;
       int c=x*y;
       System.out.println(c);
       return c;
     

     }
     
}