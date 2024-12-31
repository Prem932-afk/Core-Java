
class Pet 
{
   
     void makeSound() 
    {
        System.out.println("Pet is making a sound.");
    }
    
    
     void displayInfo() 
     {
        System.out.println("This is a pet.");
    }
}


class Cat extends Pet 
{
   
     void makeSound() 
    {
        System.out.println("Meow!");
    }

   
    void displayInfo() 
    {
        System.out.println("This is a cat.");
    }
    
 
    void scratch() 
    {
        System.out.println("The cat is scratching.");
    }
}


class Dog extends Pet
 {
     void makeSound() 
    {
        System.out.println("Woof!");
    }

     void displayInfo() {
        System.out.println("This is a dog.");
    }
    
   void fetch() 
   {
        System.out.println("The dog is fetching the ball.");
    }
}

public class Method33
{
    public static void main(String[] args) 
    {
        Dog d=new Dog();
        d.makeSound();
        d.displayInfo();
        d.fetch();
        Cat c=new Cat();
        c.makeSound();
        c.displayInfo();

    }
}