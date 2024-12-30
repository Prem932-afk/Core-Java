// Vehicle class (Superclass)
class Vehicle {
    // Instance variables
    String brand;
    int speed;

  
     void Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Vehicle Speed: " + speed + " km/h");
    }

    
}


class Car extends Vehicle {
   
    int doors;

    void Car(String brand, int speed, int doors) 
    {
      
        this.doors = doors;
        System.out.println("Number of Doors: " + doors);
    }

}


class ElectricCar extends Car 
{
   
    int batteryCapacity;

   
    void ElectricCar(int batteryCapacity) 
    {
       
        this.batteryCapacity = batteryCapacity;
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Electric cars are environmentally friendly.");
    }

   
   
}

public class Method26 {
    public static void main(String[] args) 
    {
        ElectricCar e=new ElectricCar();
        e.ElectricCar(500);
        e.Car("Kia", 120, 4);
    }
}
