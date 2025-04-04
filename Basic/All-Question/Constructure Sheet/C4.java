//Q.4

// Constructor Initialization:

// Create a class Animal with instance variables name and species. Use a constructor to initialize these variables.
public class C4 
{
  public static void main(String[] args) 
  {
     new Animal("Pijeoto", "Chill");
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
        System.out.println("Animal name :"+ name);
        System.out.println("Animal species :"+species);
    }
}