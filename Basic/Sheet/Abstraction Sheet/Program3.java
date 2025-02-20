public class Program3 
{
   public static void main(String[] args) 
   {
      bike b=new bike();
       b.startEngine();
      car c=new car();
       c.startEngine();
   }    
}
abstract class Vehicle 
{
    abstract void startEngine();
}
class car extends Vehicle
{
    void startEngine()
    {
        System.out.println("drrrrr");
    }
}
class  bike extends Vehicle
{
    void startEngine()
    {
        System.out.println("drrrrr");
    }
}
//Create a class Vehicle with an abstract method startEngine(). Implement this in subclasses Car and Bike to provide custom behavior.

