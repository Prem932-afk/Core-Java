
public class Sheet2to3 
{
  public static void main(String[] args) 
  {
    Car c=new Car();
     c.car("2022");
     c.vehicle("Swift", 180);
     c.displayCarDetails();
     c.displayVehicleDetails();
  }    
}
class Vehicle 
{
    String brand;
    int speed;

 
    void vehicle(String brand, int speed) 
    {
        this.brand = brand;
        this.speed = speed;
    }

 
    void displayVehicleDetails() 
    {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}


class Car extends Vehicle 
{
    String model;

    
    void car(String model ) 
    { 
        this.model = model;
        
    }

   
    public void displayCarDetails() 
    {
      
        System.out.println("Model: " + model);
    }
}
//Implement a program where a Car class inherits from a Vehicle class, and call the inherited method in the subclass.
