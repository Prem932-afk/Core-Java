//3)
//Create a class Vehicle with an abstract method startEngine(). Implement this in subclasses Car and Bike to provide custom behavior.

public class P3 
{
   public static void main(String[] args) 
   {
        Bike b = new Bike();
         b.startEngine();
        Car c = new Car();
         c.startEngine();
   } 
}
abstract class Vehicle
{
       abstract void startEngine();
}

class Car extends Vehicle
{
     void startEngine()
     {
        System.out.println("Car Engine sound is brrrrrr");  
     }
}
class Bike extends Vehicle
{
     
     void startEngine()
     {
        System.out.println("Bike Engine sound is brrrrrr");  
     }
}