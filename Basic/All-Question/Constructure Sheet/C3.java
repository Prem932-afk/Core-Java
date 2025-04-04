//Q.3
// Constructor with Parameters:

// Write a class Car that has a constructor to initialize the model and year of a car.


public class C3 
{
   public static void main(String[] args) 
   {
     new Car("1997","Maruti");
   }   
}
class Car 
{
    Car(String year, String model)
    {
       
       System.out.println("Car year :"+ year);
       System.out.println("Car mode :"+model);
    } 
}
