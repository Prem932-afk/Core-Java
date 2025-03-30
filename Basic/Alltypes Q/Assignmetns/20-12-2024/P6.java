  
// //user input of instance variable through method and parameter name is same 
// add()
// sub()
// div()
// multi() 
// no third variable allow   
  
import java.util.*;
public class P6 
    
{
   public static void main(String[] args) 
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your number :");
     int a=sc.nextInt();
     int b=sc.nextInt();

     A p=new A(a,b);
      p.add();
      p.sub();
      p.mul();
      p.div();

      
   }    
}
class A
{
    int a;
    int b;

    A(int a,int b)
    {
          this.a=a;
          this.b=b;
          
    }

    
    void add()
    {
        
        int c=a+b;
        System.out.println("Addition :"+c);
    }

    void sub()
    {
        
        int c=a-b;
        System.out.println("Substracton :"+c);
    }

    void mul()
    {
          
          int c=a*b;
          System.out.println("Multiple :"+c);
    }

    void div()
    {
          
          int c=a/b;
          System.out.println("Divison :"+c);
    }   

}