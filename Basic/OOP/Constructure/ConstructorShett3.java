public class ConstructorShett3 
{
  public static void main(String[] args) 
  {
      new Car("kia","2021");
  }    
}
class Car
{
       Car(String model, String year)
       {
            System.out.println("Car Model :"+model);
            System.out.println("Car Year :"+year);
       }
}
// Constructor with Parameters:

//  Write a class Car that has a constructor to initialize the model and year of a car.
