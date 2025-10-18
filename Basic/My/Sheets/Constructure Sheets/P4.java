// 4)
// Constructor Initialization:

// Create a class Animal with instance variables name and species. Use a constructor to initialize these variables.


public class P4 
{ 
  public static void main(String[] args) 
  {
     new Animal("Sparrow", "Bird");
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
       System.out.println("Animal name :"+name);
       System.out.println("Animal species :"+ species);
    }
}
