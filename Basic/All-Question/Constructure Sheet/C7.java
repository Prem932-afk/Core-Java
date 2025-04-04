//Q.7

// Constructor with Multiple Parameters:

// Write a program to create a Rectangle class with length and breadth as instance variables. Use a constructor to initialize them.
public class C7 
{
  public static void main(String[] args) 
  {
    new Rectangle(44, 33);
  }    
}
class Rectangle
{
    int length;
    int breadth;

    Rectangle(int length, int breadth)
    {
        this.length=length;
        this.breadth=breadth;
        System.out.println("Recatngle length :"+length);
        System.out.println("Rectagnle breadth :"+breadth);
    }
}