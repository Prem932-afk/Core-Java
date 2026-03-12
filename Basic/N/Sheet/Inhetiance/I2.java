//Q.2) Create a Java program where a Dog class inherits a Mammal class, and call a method to display their characteristics.
public class I2 
{
 public static void main(String[] args) 
 {
     Dog d=new Dog();
      d.display();
 }    
}

class Mammle
{
    String specific="Mammle";
    boolean hair=true;
    boolean givebirth=true;

    void display()
    {
        System.out.println("Specific : " + specific);
        System.out.println("Hair : " + hair);
        System.out.println("Birth : " + givebirth);
    }
}

class Dog extends Mammle
{
     String sound="bark";
     String bread="German Shephard";

     void display()
     {
         super.display();
         System.out.println("Bread : " + bread);
         System.out.println("Sound : " + sound);
     }
}
