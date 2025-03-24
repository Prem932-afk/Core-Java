// 15)
// Constructor with Instance Variable Initialization:

// Create a class Circle with a radius instance variable. Use a constructor to initialize the radius value and then write a method to display the radius.

public class P15 
{
      public static void main(String[] args) 
      {
         Circle c = new Circle(33);
         c.displayDetails();

      }
}
class Circle 
{
    int radius;
    Circle(int radius)
    {
          this.radius=radius;

    }
    void displayDetails()
    {
        System.out.println("Circle Radius : "+ radius);
    }
}
