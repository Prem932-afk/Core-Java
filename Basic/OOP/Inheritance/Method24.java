

// Main class to test the Shape and Rectangle classes
class Method24 {
    public static void main(String[] args) 
    {
        // Create an instance of the Rectangle class
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        // Call the calculateArea method to get the area of the rectangle
        double area = rectangle.calculateArea();

        // Display the area of the rectangle
        System.out.println("The area of the rectangle is: " + area + " square units.");
    }
}


// Shape class (Superclass)
class Shape {
    // Method to calculate area (This will be overridden by subclasses)
    double calculateArea() 
    
    {
        System.out.println("Calculating area...");
        return 0;  // Default implementation (can be overridden)
    }
}

// Rectangle class (Subclass) that inherits from Shape
class Rectangle extends Shape {
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
