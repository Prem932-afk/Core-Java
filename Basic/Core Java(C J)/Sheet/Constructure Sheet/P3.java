//3)
// Constructor with Parameters:

// Write a class Car that has a constructor to initialize the model and year of a car.

public class P3 
{
  public static void main(String[] args) 
  {
      new Car("TaTa", "2022");
  }    
}

class Car 
{
    String model;
    String year;

    Car(String model, String year)
    {
        this.model=model;
        this.year=year;

        System.out.println(model);
        System.out.println(year);
    }

}
