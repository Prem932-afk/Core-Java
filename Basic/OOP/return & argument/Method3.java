class Method3
{
    public static void main(String[] args)
    {
         A p=new A();
         System.out.println(p.add(5, 3));  
         B p1=new B();
         System.out.println(p1.Even(4));  
         C p2=new C();
         System.out.println(p2.odd(5));
    }
}
class A
{
    int add(int a, int b)
    {
        int x=a;
        int y=b;
        int c=x+y;
        return c;
    }
    int div(int a, int b)
    {
        int x=a;
        int y=b;
        int c=x/y;
        return c;
    }
    int mul(int a, int b)
    {
        int x=a;
        int y=b;
        int c=x*y;
        return c;
    }
    int sub(int a, int b)
    {
        int x=a;
        int y=b;
        int c=x-y;
        return c;
    }

    
}
class B
{
    int Even(int n)
    {
       
        if(n%2==0)
        {
            System.out.println("Even number");
        }
        return n;
    }
}
class C
{
    int odd(int n)
    {
       
        if(n%2==0)
        {
            System.out.println("Even number");
        }
        return n;
    }
}