// 10)
// Create a program where a Vehicle class is inherited by a Car class, which is then inherited by a SportsCar class. Each class should have its own unique metho


// Main class
public class P10
{
    public static void main(String[] args) 
    {
        SportsCar sc = new SportsCar();

        // Call methods from all classes
        sc.start();   // Vehicle method
        sc.fuel();    // Car method
        sc.turbo();   // SportsCar method
    }
}
// Base class
class Vehicle 
{
    void start() 
    {
        System.out.println("Vehicle is starting");
    }
}

// Car class inherits Vehicle
class Car extends Vehicle 
{
    void fuel() 
    {
        System.out.println("Car is using petrol");
    }
}

// SportsCar class inherits Car
class SportsCar extends Car 
{
    void turbo() 
    {
        System.out.println("SportsCar is using turbo mode!");
    }
}


