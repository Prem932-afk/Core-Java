import java.util.Scanner;
class Method5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int x=sc.nextInt();
        int y=sc.nextInt();
        A p=new A(x,y);
        p.add();
        p.sub();
        p.mul();
        p.div();
    }
}
class A
{
    int a,b;
    A(int x, int y)
    {
        a=x;
        y=b;
        
    }

     void add()
    {
        int c=a+b;
        System.out.println(c);
    }

    void sub()
    {
        int c=a*b;
        System.out.println(c);
    }

    void mul()
    {
        int c=a*b;
        System.out.println(c);
    }
    void div()
    {
        int c=a/b;
        System.out.println(c);
    }
}