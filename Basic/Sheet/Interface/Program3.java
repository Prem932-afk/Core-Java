public class Program3 
{
   public static void main(String[] args) 
   {
      Duck d=new Duck();
       d.fly();;
       d.swimmable();
   }    
}
interface Flyable
{
   void fly();
}

interface Swimmable
{
   void swimmable();
}

class Duck
{
    public void fly()
    {
      System.out.println("The is Flying");
    }

    public void swimmable()
    {
      System.out.println("The is Swimmable");
    }

}
//Create two interfaces Flyable and Swimmable. Define appropriate methods in each. Create a class Duck that implements both interfaces and demonstrates their usag
