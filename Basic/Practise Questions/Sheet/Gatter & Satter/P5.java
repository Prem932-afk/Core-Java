//Q.5)
  
//Getter for Calculated Value.

//Create a Rectangle class with private fields length (double) and width (double). Write getter methods for length and width, and add a getter for area that calculates the area (length * width).
  
class P5
{
    public static void main(String[] args) 
    {
        Rectangle r=new Rectangle(22, 33);
         System.out.println(r.getLength());
         System.out.println(r.getWidth());
         System.out.println("Area of Rectangle " + r.getAdd());
    }
}

class Rectangle
{
    private double length;
    private double width;

    Rectangle(double width, double length)
    {
         this.length=length;
         this.width=width;
    }

    double getLength()
    {
          return length;
    }

    double getWidth()
    {
         return width;
    }

    double getAdd()
    {
         return length * width;
    }

}