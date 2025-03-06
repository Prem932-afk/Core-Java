//2)
//Create a Java program where a Dog class inherits a Mammal class, and call a method to display their characteristics.

public class Program2 
{
   public static void main(String[] args) 
   {
         Dog myDog = new Dog();

        // Call the displayCharacteristics method
        System.out.println("Dog Characteristics:");
        myDog.displayCharacteristics();
   } 
}
class mammal
{
    String species = "Mammal";
    boolean hasHair = true;
    boolean givesBirth = true;

   
     void displayCharacteristics() 
    {
        System.out.println("Species: " + species);
        System.out.println("Has Hair: " + hasHair);
        System.out.println("Gives Birth: " + givesBirth);
    }
}
class Dog extends mammal
{
    String breed = "Golden Retriever";
    String sound = "Bark";

   
    void displayCharacteristics() 
    {
        
        super.displayCharacteristics();

        System.out.println("Breed: " + breed);
        System.out.println("Sound: " + sound);
    }
}
