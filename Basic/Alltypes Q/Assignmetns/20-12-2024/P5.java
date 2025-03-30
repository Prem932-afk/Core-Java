  
// //user input of instance variable through parameterised constructor and parameter name is also different 
// A :addition

// B :sub

// C :multi

// D:div

  
  
import java.util.Scanner;
public class P5 
    
{
   public static void main(String[] args) 
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your number :");
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
    int a;
    int b;

    A(int x,int y)
    {
          a=x;
          b=y;
          
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