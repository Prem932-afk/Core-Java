
// class A
// 	parameterised constructor :two number addition 

// class B
// 	parameterised constructor :two number subs

// class C
// 	parameterised constructor :two number div

// class D
// 	parameterised constructor :two number multi
	
	
	
	
 
import java.util.Scanner;
public class A1 
{
      public static void main(String[] args) 
      {

       A p=new A(2,4);
         p.add();

       B p1=new B(3,4);
         p1.sub();

       C p2=new C(5,7);
         p2.div();

       D p3=new D(9,8);
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