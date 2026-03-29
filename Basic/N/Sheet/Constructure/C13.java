// 15)
// Constructor with Instance Variable Initialization:

// Create a class Circle with a radius instance variable. Use a constructor to initialize the radius value and then write a method to display the radius.


class C13
{
    public static void main(String[] args) 
    {
         Circle c=new Circle(5.5);
         c.display();
    }
}

class Circle 
{
    double radius;

    Circle(double radius)
    {
        this.radius=radius;
    }

    void display()
    {
        System.out.println("Circle Radius : " + radius);
    }
}