public class Program7 
{
  public static void main(String[] args) 
  {
     new Rectangle(22, 34);
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
        System.out.println("Recatange Length :"+length);
        System.out.println("Rectangle Breadth :"+breadth);
    }
}
// 7)
// Constructor with Multiple Parameters:

// Write a program to create a Rectangle class with length and breadth as instance variables. Use a constructor to initialize them.
