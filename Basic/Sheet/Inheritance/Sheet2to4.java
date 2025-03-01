import javax.sound.sampled.SourceDataLine;

public class Sheet2to4 
{
  public static void main(String[] args) 
  {
      Rectangle r=new Rectangle();
       r.area(23, 44);
  }    
}
class Shape
{
  void area(int length,int breath)
  {
    double area=length*breath;
    System.out.println("Rectangel area"+area);
  }
}
class Rectangle extends Shape
{
     Rectangle()
     {
      System.out.println("Recatangle Cons");
        
     } 
}
//Write a Java program where a Rectangle class inherits a Shape class and calculates the area using a method in the superclass.

