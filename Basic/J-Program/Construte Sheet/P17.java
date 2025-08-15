
//  Q.17)
 

// Simple Constructor Example:

// Write a class Person with instance variables name and age. Create a constructor that initializes these values and a method displayDetails() that prints the values.

public class P17 
{
   public static void main(String[] args) 
   {
      Person p=new Person(22, "Jay");
   }    
}
class Person
{
        int age;
        String name;
        Person(int age, String name)
        {
            this.age=age;
            this.name=name;
        }
        void displayDetails()
        {
            System.out.println("Age :"+age);
            System.out.println("Name :"+name);
        }
}