
import java.util.*;
public class Program7
    
{
   public static void main(String[] args) 
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your number :");
     int a=sc.nextInt();
     int b=sc.nextInt();

     A p=new A();
      p.add(a,b);
      p.sub(a,b);
      p.mul(a,b);
      p.div(a,b);

      
   }    
}
class A
{
    int a;
    int b;

    
    void add(int a, int b)
    {
        this.a=a;
        this.b=b;
        int c=a+b;
        System.out.println("Addition :"+c);
    }

    void sub(int a, int b)
    {
        this.a=a;
        this.b=b;
        int c=a-b;
        System.out.println("Substracton :"+c);
    }

    void mul(int a, int b)
    {
          this.a=a;
          this.b=b;
          int c=a*b;
          System.out.println("Multiple :"+c);
    }

    void div(int a, int b)
    {
          this.a=a;
          this.b=b;
          int c=a/b;
          System.out.println("Divison :"+c);
    }   

}

//user input of instance variable through method and parameter name is same 
// add()
// sub()
// div()
// multi() 
// no third variable allow 
//user input of instance variable through parameterised constructor and parameter name same : 

// A :addition

// B :sub

// C :multi

// D:div
