public class Sheet2to6 
{
  public static void main(String[] args) 
  {
         new ElectricCar();
         System.out.println(" ");
         new car();
         System.out.println(" ");
         new vehicle();
  }
    
}
class vehicle
{
       vehicle()
       {
        System.out.println("Vehcile class");
       }
}
class car extends vehicle
{
      car()
      {
        System.out.println("car inherite vehicle class");
      }
} 
class ElectricCar extends car
{
      ElectricCar()
      {
        System.out.println("Electric car inherit car class");
      }
}
//Write a Java program to demonstrate multilevel inheritance where Car inherits Vehicle and ElectricCar inherits Car.

