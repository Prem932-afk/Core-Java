public class ConstrucotrSheet16 
{
   public static void main(String[] args) 
   {
     new Car();
   }    
}
class Car
{
     String model;
     String year;
     Car()
     {
        model="2024";
        year="default";
        System.out.println("Model :"+model);
        System.out.println("Year :"+year);
     }
}
//Constructor with Parameter and Default Initialization:

//Define a class Car that has model and year as instance variables. Write a constructor that accepts model and sets year to 2024 by default.
