//10.Create a program where a Vehicle class is inherited by a Car class, which is then inherited by a Sports Car class. Each class should have its own unique method. 



class Vehicle 
{
    String brand;
    int year;

   
    void vehicle(String brand, int year) 
    {
        this.brand = brand;
        this.year = year;
    }

    
     void displayDetails() 
     {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("This is a general vehicle.");
    }

   
}


class Car extends Vehicle 
{
    int numberOfDoors;

   
    void car( int numberOfDoors) 
    {
      
        this.numberOfDoors = numberOfDoors;
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("This is a regular car.");
    }

    
}


class SportsCar extends Car 
{
    int topSpeed;

    
    void sportsCar(int topSpeed) 
    {
        System.out.println("Top speed: " + topSpeed + " km/h");
        System.out.println("This is a high-performance sports car with excellent speed.");
        this.topSpeed = topSpeed;
    }

  

}


public class P10 
{
    public static void main(String[] args) 
    {
        SportsCar s=new SportsCar();
        s.sportsCar(300);
        s.car(4);
        s.vehicle("kia", 1997);
        s.displayDetails();
    }
}
