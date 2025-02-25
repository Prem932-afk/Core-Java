public class Program4 
{
   public static void main(String[] args) 
   {
      new Animal("Cow", "Egle");
   } 
}
class Animal
{
    String name;
    String Species;

    Animal(String name, String Species)
    {
        this.name=name;
        this.Species=Species;
        System.out.println("The Animal name is :"+name);
        System.out.println("The Animal Species :"+Species);
    }
}

// Constructor Initialization:

// Create a class Animal with instance variables name and species. Use a constructor to initialize these variables.

