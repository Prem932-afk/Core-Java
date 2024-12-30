public class Method22 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.mammal("Cnnier");
        d.dog("German Shephard");
    }
}
class Mammal
{
     String species;
     void mammal(String species)
     {
        this.species=species;
        System.out.println(species);
     }
}
class Dog extends Mammal
{
    String breads;
    void dog(String breads)
    {
      this.breads=breads;
      System.out.println(breads);
    }
}
//Create a Java program where a Dog class inherits a Mammal class, and call a method to display their characteristics.