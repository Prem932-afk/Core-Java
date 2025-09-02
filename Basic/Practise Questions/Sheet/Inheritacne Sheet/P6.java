

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
        this.brand=brand;
        this.year=year;
     }
     String getBrand()
     {
        return brand;
     }
     String getYear()
     {
        return getYear();
     }
     void display()
     {
        System.out.println(year);
        System.out.println(brand);
     }
}
class Car extends Vehicle
{
    private String door;
    Car(String year, String brand, String door)
    {
       super(year, brand);
       this.door=door;
    }
    String getDoor()
    {
        return door;
    }
    void display()
    {
        super.display();
        System.out.println(door);
    }
}
class ElectricCar extends Car
{
   private int bataryCapasity;
   ElectricCar(String brand , String year, String door, int bataryCapasity)
   {
     super(year, brand, door);
     this.bataryCapasity=bataryCapasity;
   }
   int getBataryCapasit()
   {
      return bataryCapasity;
   }
   void display()
   {
     super.display();
     System.out.println(bataryCapasity);
   }
}

