
// 8)
// Implement a program where a Shape class is inherited by a Circle class, and then a Cylinder class inherits from the Circle class to calculate volume.

class P8
{
    public static void main(String[] args) 
    {
        
        Cylinder myCylinder = new Cylinder("Red", 5.0, 10.0);

      
        myCylinder.showDetails();

      
        double volume = myCylinder.calculateVolume();
        System.out.println("Cylinder Volume: " + volume);
    }
}
class Shape 
{
  
    private String color;

   
    Shape(String color) 
    {
        this.color = color;
    }

 
    String getColor() 
    {
        return color;
    }

   
     void showDetails() 
    {
        System.out.println("Shape Color: " + color);
    }
}


class Circle extends Shape 
{
    private double radius;


    Circle(String color, double radius) 
    {
        super(color);
        this.radius = radius;
    }

   
     double getRadius() 
     {
        return radius;
    }

  
   void showDetails() 
    {
        super.showDetails();  
        System.out.println("Circle Radius: " + radius);
    }

    double calculateArea() 
    {
        return Math.PI * radius * radius;
    }
}


class Cylinder extends Circle 
{
    private double height;

    Cylinder(String color, double radius, double height) 
    {
        super(color, radius); 
        this.height = height;
    }

  
     double getHeight() 
    {
        return height;
    }

    void showDetails() 
    {
        super.showDetails(); 
        System.out.println("Cylinder Height: " + height);
    }

    
    double calculateVolume() 
    {
        return calculateArea() * height; 
    }
}


