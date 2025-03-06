
// Q.2
 
// Define an abstract class Animal with an abstract method makeSound(). Implement this in subclasses Dog, Cat, and Cow.




public class Program2 
{
   public static void main(String[] args) 
   {
      Cow c=new Cow();
       c.makeSound();
      Cat ca=new Cat();
       ca.makeSound();
      Dog d=new Dog();
       d .makeSound();
   }    
}
abstract class Animal
{
      abstract void makeSound(); 
}

class Dog extends Animal
{
     public void makeSound()
     {
        System.out.println("boo boo");
     }
}

class Cat extends Animal
{
     public void makeSound()
     {
        System.out.println("Mew Mew");
     }
}

class Cow extends Animal
{
     public void makeSound()
     {
        System.out.println("Aooo");
     }
}




