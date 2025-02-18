import java.util.*;
class Program1
{
    public static void main(String[] args) 
    {
         Rectangle r = new Rectangle(20);
         r.calculateArea();
         r.displayDetails();
         
    }
}

abstract class shape
{
    abstract void calculateArea();
    abstract void displayDetails();
}

class Circle extends shape
{
     int radius;
     void circle(int radius)
     {
        this.radius=radius;
     }

     void calculateArea()
     {
        int area=radius * radius;
     }

     void displayDetails()
     {
        System.out.println("Area of Circle :"+area);
     }
}

class Rectangle extends Circle
{
     int length;
     Rectangle(int length)
     {
          this.length=length;
     }

     void calculateArea()
     {
        int Rarea=length*length;
     }

     void displayDetails()
     {
        System.out.println("Area of Rectange :"+Rarea);
     }
}
//Create an abstract class Shape with methods calculateArea() and displayDetails(). Create subclasses Circle and Rectangle to implement these methods.