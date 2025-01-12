public class ConstructorSheet4 
{
   public static void main(String[] args) 
   {
       new Animal("Parrot", "Bird");
   }    
}
class Animal
{
          String name;
          String species;
          Animal(String name, String species)
          {
              this.name=name;
              this.species=species;
              System.out.println("Name : "+name);
              System.out.println("Species :"+ species);
          }
}
// Constructor Initialization:

// Create a class Animal with instance variables name and species. Use a constructor to initialize these variables.
