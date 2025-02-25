public class Program3 
{
   public static void main(String[] args) 
   {
      new Car("2022", "kia");
   }    
}
class Car 
{
    Car(String model, String year)
    {
        model=model;
        year=year;
        System.out.println("Car Model :"+model);
        System.out.println("Car Year :"+year);
    }
}
//Constructor with Parameters:

// Write a class Car that has a constructor to initialize the model and year of a car.
