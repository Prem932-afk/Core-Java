public class Program5 
{
    public static void main(String[] args) 
    {
        Rec r=new Rec(5,10);
        System.out.println("Length"+r.getLength());
        System.out.println("Width"+r.getWidth());
        System.out.println("Area"+r.getArea());
    }
}

class  Rec
{
    private double length;
    private double width;

    Rec(double length, double width)
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
    double getArea()
    {
        return length*width;
    }
}
//Getter for Calculated Value

//Create a Rectangle class with private fields length (double) and width (double). Write getter methods for length and width, and add a getter for area that calculates the area (length * width).

