import java.util.*;
class Method3 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number :");
        int x=sc.nextInt();
        System.out.println("Enter second number :");
        int y=sc.nextInt();
        A p=new A();
        p.add(x, y);
    }
}
class A
{
    int a,b;
    void add(int x, int y)
    {
        a=x;
        b=y;
        int c=a+b;
        System.out.println("Addition of two value : "+c);
    }
}

