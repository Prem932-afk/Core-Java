//Implement a program where a Car class inherits from a Vehicle class, and call the inherited method in the subclass.


public class P3 
{
    public static void main(String[] args) 
	{
        Car c=new Car();
        c.vehicle(80, "Kia");
        c.car(4);
    }
}
class Vehicle
{
    int speed;
    String brand;
    void vehicle(int speed, String brand)
    {
        this.speed=speed;
        this.brand=brand;
        System.out.println("speed :"+speed);
        System.out.println("brand"+brand);
    }
}
class Car extends Vehicle
{
      int doors;
      void car(int doors)
      {
        this.doors=doors;
        System.out.println("Doors :"+doors);
      }
}