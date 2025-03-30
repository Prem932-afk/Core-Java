// 4)
// Write a program using an abstract class Appliance with abstract methods turnOn() and turnOff(). Implement it in classes Fan and WashingMachine


public class P4 
{
  public static void main(String[] args) 
  {
       WashingMachine w = new WashingMachine();
        w.turnOn();
        System.out.println(" ");
        w.turnOff();
  }    
}
abstract  class Appliance
{
    abstract void turnOn();
    abstract void turnOff();  
}

class Fan extends Appliance
{
      void turnOn()
      {
        System.out.println("Turn on the fan");
      } 

      void turnOff()
      {
        System.out.println("Turn off the fan");
      }
}

class WashingMachine extends Appliance
{
      void turnOn()
      {
        System.out.println("Turn on the Washingmachine");
      }

      void turnOff()
      {
        System.out.println("Turn off the Washigmachine");
      }

}
