import java.util.Scanner;
class Method1
{
  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter first number :");
   int a=sc.nextInt();
   System.out.println("Enter second number");
   int b=sc.nextInt();
   A p=new A(a,b);
     p.add();
   B p1=new B(a,b);
     p1.sub();
   C p2=new C(a,b);
     p2.div();
   D p3=new D(a,b);
     p3.Mul();
  }
}
class A
{
    int a,b;
    A(int a,int b)
    {
       this.a=a;
       this.b=b;
    }

    int add()
    {
         int sum=a+b;
         System.out.println("Additon Number :"+sum);
         return sum;
    }
   
   
    
}
class B
{
    int a,b;
    B(int a,int b)
    {
       this.a=a;
       this.b=b;
    }
    int sub()
    {
        int sub=a-b;
        System.out.println("Substraction : "+sub);
        return sub;
    }
}
class C
{
    int a,b;
    C(int a,int b)
    {
       this.a=a;
       this.b=b;
    }
    int div()
    {
       int div=a/b;
       System.out.println("Divison :"+div);
       return div;
    }
}
class D
{
    int a,b;
    D(int a,int b)
    {
       this.a=a;
       this.b=b;
    }
    int Mul()
    {
        int mul=a*b;
        System.out.println("Multipliaction : "+mul);
        return mul;
    }
}