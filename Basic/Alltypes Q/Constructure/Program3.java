public class Program3 
{
 public static void main(String[] args) 
 {
     car c=new car("swit", 2022);
 }    
}

class car
{
    String model;
    int year;
    car(String model, int year)
    {
        this.model=model;
        this.year=year;
        System.out.println("Car Model :"+model);
        System.out.println("Car year :"+year);
    }
}
//3)
// Constructor with Parameters:

// Write a class Car that has a constructor to initialize the model and year of a car.
