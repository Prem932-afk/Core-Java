// 7)
// Constructor with Multiple Parameters:

// Write a program to create a Rectangle class with length and breadth as instance variables. Use a constructor to initialize them.


public class P7 
{
  public static void main(String[] args) 
  {
        Rectrangle r = new Rectrangle(100, 100);
  }    
}

class Rectrangle 
{
    int  length;
    int  breadth;

    Rectrangle(int length, int breadth)
    {
        this.length=length;
        this.breadth=breadth;

        System.out.println("Length : " + length);
        System.out.println("Breadth : " + breadth);
    }
}