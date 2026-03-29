
// 14)
// Constructor with Parameter and Default Initialization:

// Define a class Car that has model and year as instance variables. Write a constructor that accepts model and sets year to 2024 by default.

class C14
{
  public static void main(String[] args) 
  {
            Car c=new Car("Ertica", "2022");
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

        System.out.println("Car model : " + model);
        System.out.println("Car Year : " + year);
    }

    
}