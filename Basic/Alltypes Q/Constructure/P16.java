// 16)
// Constructor with Parameter and Default Initialization:

// Define a class Car that has model and year as instance variables. Write a constructor that accepts model and sets year to 2024 by default.


public class P16 
{
    public static void main(String[] args) 
    {
        Car c =new Car("kIA");
        
    } 
}

class Car 
{
          String model;
          int year;
          Car(String model)
          {
            this.model=model;
            this.year=2024;
            System.out.println("Car year : "+ year);
            System.out.println("Car Model : "+ model);
          }
}