import java.util.Scanner;
public class Method4 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter first number");
      int x=sc.nextInt();
      System.out.println("Enter second number");
      int y=sc.nextInt();
      A p=new A();
      System.out.println(p.add(x, y));
      System.out.println(p.sub(x, y));
      System.out.println(p.div(x, y));
      System.out.println(p.mul(x, y));
        
    }
}

class A
{
     int a,b;
     int add(int x, int y)
     {
        a=x;
        b=y;
        return a+b;
     }
     int sub(int x, int y)
     {
        a=x;
        b=y;
        return a-b;
     }
     int div(int x, int y)
     {
        a=x;
        b=y;
        return a/b;
     }
     int mul(int x, int y)
     {
        a=x;
        b=y;
        return a*b;
     }
}