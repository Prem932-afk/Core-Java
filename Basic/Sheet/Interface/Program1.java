class Program1
{
    public static void main(String[] args) 
    {
        Rectangle r=new Rectangle();
         r.rectangle(20);
         r.calculateArea();

        new Circle(20);

    }
}
interface shape
{
    void calculateArea();
}
class Circle implements shape
{
    int radius;
    int area;
     Circle(int radius)
    {
        this.radius=radius;
    }
    public void calculateArea()
    {
        area=radius*radius;
        System.out.println("Area of Circle"+area);
    }
}
class Rectangle implements shape
{
    int length;
    int area;
    public void rectangle(int length)
    {
        this.length=length;
    }

    public void calculateArea()
    {
        area=length*length;
        System.out.println("Area of Circle"+area);
    }
}
//Create an interface Shape with a method calculateArea(). Implement this interface in classes Circle and Rectangle to calculate their respective areas.