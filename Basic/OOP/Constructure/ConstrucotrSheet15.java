public class ConstrucotrSheet15 
{
   public static void main(String[] args) 
   {
      Circle c=new Circle(22);
      c.display();
   }    
}
class Circle
{
      int radius;
      Circle(int radius)
      {
         this.radius=radius;
      }
      void display()
      {
        System.out.println("radius" +radius);
      }
}
//Constructor with Instance Variable Initialization:

//Create a class Circle with a radius instance variable. Use a constructor to initialize the radius value and then write a method to display the radius.