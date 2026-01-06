//3)
// Constructor with Parameters:

// Write a class Car that has a constructor to initialize the model and year of a car.

public class P3 
{
   public static void main(String[] args) 
   {
      new Car("Maruti Suzuki", 1998);
   }    
}

class Car 
{
    String model;
    int year;
    Car(String model, int year)
    {
        this.model=model;
        this.year=year;
        System.out.println("Model of Car : " + model);
        System.out.println("Year of Car : " + year);
    }
}
