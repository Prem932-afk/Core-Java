import java.util.Scanner;

public class method13 {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your number");
    int a=sc.nextInt();
    int b=sc.nextInt();
    B d=new B();
    d.show();
    d.show(2, 3);
    
 }   
}
class A
{
    void show(int a,int b)
    {
     
        int c=a+b;
        System.out.println("value of c :"+c);
    }
}
class B extends A
{
    void show()
    {
       
        System.out.println("method 2");
    }
}
