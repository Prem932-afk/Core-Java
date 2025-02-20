public class Sheet2to2 
{
  public static void main(String arg[])
  {
          Dog d=new Dog();
          d.mammal("German", "Black");
          d.characteristics();
  }    
}
class Mammal
{
  
    String Brid;
    String color;

    void mammal(String Brid, String color)
    {
         this.Brid=Brid;
         this.color=color;
    }
}
class Dog extends Mammal
{
    void characteristics()
    {
      System.out.println("Dog Brid :"+Brid);
      System.out.println("Dog color: "+color);
    }
}
//Create a Java program where a Dog class inherits a Mammal class, and call a method to display their characteristics.