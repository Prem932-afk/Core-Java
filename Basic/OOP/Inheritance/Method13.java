import java.util.*;
public class Method13 {
public static void main(String[] args) {
    
    D d=new D();
    
}    
}
class A
{
    A()
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int add=a+b;
        System.out.println("Addition"+add);
    }
}
class B extends A
{
    B()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sub=a-b;
        System.out.println("Substraction"+sub);
    }
}
class C extends B
{
    C()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int mul=a*b;
        System.out.println("Multiplication"+mul);
    }
}
class D extends C
{
    D()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int div=a/b;
        System.out.println("Division"+div);
    }
}

// 
// multilevel inheritance :
// A 
// 	default constructor :user input add 

// B
// 	default constructor :user input :multiplication 

// C 
// 	default constructor :normal statement 

// child k through access 