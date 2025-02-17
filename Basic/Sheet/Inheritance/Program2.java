//Create a Java program where a Dog class inherits a Mammal class, and call a method to display their characteristics.
class Program2
{
     public static void main(String[] args) 
     {
        Dog d=new Dog();
         d.dog("Canis lupus familiaris", true,"German");
         d.displayMammalCharacteristics();
         d.displayMammalCharacteristics();
     }
}

class Mammal 
{
    String species;
    boolean hasFur;

    void mammal(String species, boolean hasFur) 
    {
        this.species = species;
        this.hasFur = hasFur;
    }

   
   void displayMammalCharacteristics() 
   {
        System.out.println("Species: " + species);
        System.out.println("Has Fur: " + (hasFur ? "Yes" : "No"));
    }
}

class Dog extends Mammal 
{
    String breed;

   
   void dog(String species, boolean hasFur, String breed) 
   {
  
        this.breed = breed;
        
    }

  
    public void displayDogCharacteristics() 
    {
        displayMammalCharacteristics(); 
        System.out.println("Breed: " + breed);
    }
}