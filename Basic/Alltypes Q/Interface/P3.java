// 3)

// Create two interfaces Flyable and Swimmable. Define appropriate methods in each. Create a class Duck that implements both interfaces and demonstrates their usag

public class P3 
{
  public static void main(String[] args) 
  {
     Duck d = new Duck();
      d.fly();
      d.Swim();
  }    
}

interface Flyable 
{
   void fly();
}
interface Swimmable 
{
   void Swim();   
}
class Duck implements Flyable, Swimmable
{
    public void fly()
    {
        System.out.println("Flye");
    }
    public void Swim()
    {
        System.out.println("Swim");
    }
}
