//  Q.7)
 
// Constructor with Multiple Parameters:

// Write a program to create a Rectangle class with length and breadth as instance variables. Use a constructor to initialize them.
 
 
 
 public class P7
{
  public static void main(String[] args) 
  {
     new Rectangle(22, 33);
  }  
}
class Rectangle
{
       double length;
       double breath;
       Rectangle(double length, double breadth)
       {
           this.length=length;
           this.breath=breadth;
           System.out.println("Rectangle length :"+length);
           System.out.println("Rectangle breath "+breadth);
       }
}
