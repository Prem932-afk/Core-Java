public class method17 {
    public static void main(String[] args) {
        B c=new B();
        c.add();
    }
}

class A
{
    int a,b;
    void add(int a,int b)
    {
        this.a=a;
        this.b=b;
       
    }
}
class B extends A
{
    void add()
    {
       
        super.add(2,3);
        int c=a+b;
        System.out.println("your addition number :"+c);
    }
}