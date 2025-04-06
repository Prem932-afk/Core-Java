//Write a Java program where a Rectangle class inherits a Shape class and calculates the area using a method in the superclass.

class P4 
{
    public static void main(String[] args) 
    {
        
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        
        double area = rectangle.calculateArea();

       
        System.out.println("The area of the rectangle is: " + area + " square units.");
    }
}



class Shape 
{
   
    double calculateArea() 
    
    {
        System.out.println("Calculating area...");
        return 0;  
    }
}


class Rectangle extends Shape 
{
    // Instance variables for Rectangle class
    double length;
    double width;

    // Constructor for Rectangle class
    public Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }

   
     double calculateArea() 
     {
        // Calculating the area of the rectangle
        return length * width;
    }
}
