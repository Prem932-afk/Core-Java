
class Shape 
{
    
 void displayDetails() 
 {
        System.out.println("This is a shape.");
 }
}


class Circle extends Shape 
{
    double radius;

    
    void circle(double radius) 
    {
        this.radius = radius;
    }

   
     double area() 
    {
        System.out.println("Circle with radius: " + radius);
        System.out.println("Circle Area: " + area());
        return Math.PI * radius * radius;
      
    }

   
}


class Cylinder extends Circle 
{
    double height;

    
       void cylinder( double height) 
       {
        System.out.println("Cylinder with height: " + height);
        System.out.println("Cylinder Volume: " + volume());
       
        this.height = height;
       }

   
    public double volume() 
    {
        return area() * height; // Volume = Area of circle * Height
    }

 
   
}


class Method28 {
    public static void main(String[] args) 
    {
       Cylinder c=new Cylinder();
       c.cylinder(34);
       c.circle(34);
       c.displayDetails();
    }
}
