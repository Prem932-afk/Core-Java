

//Q.6) Write a Java program to demonstrate multilevel inheritance where Car inherits Vehicle and ElectricCar inherits Car.
public class P6 
{
   public static void main(String[] args) 
   {
      ElectricCar e = new ElectricCar("TATA", "2022", "Four", 200);
      e.display();
   }  
}

class Vehicle
{
     private String brand;
     private String year;

     Vehicle(String brand, String year)
     {
        this.brand = brand;
        this.year = year;
     }

     String getBrand()
     {
        return brand;
     }

     String getYear()
     {
        return year;
     }

     void display()
     {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
     }
}

class Car extends Vehicle
{
    private String door;

    Car(String brand, String year, String door)
    {
       super(brand, year);
       this.door = door;
    }

    String getDoor()
    {
        return door;
    }

    void display()
    {
        super.display();
        System.out.println("Doors: " + door);
    }
}

class ElectricCar extends Car
{
   private int batteryCapacity;

   ElectricCar(String brand , String year, String door, int batteryCapacity)
   {
     super(brand, year, door);
     this.batteryCapacity = batteryCapacity;
   }

   int getBatteryCapacity()
   {
      return batteryCapacity;
   }

   void display()
   {
     super.display();
     System.out.println("Battery Capacity: " + batteryCapacity);
   }
}