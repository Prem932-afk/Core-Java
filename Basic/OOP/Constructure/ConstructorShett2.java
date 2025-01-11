public class ConstructorShett2 
{
  public static void main(String[] args) 
  {
       new Person();
  }    
}
class Person
{
    Person()
    {
         String name="James Gosling";
         int age=21;
         System.out.println("Name :"+name);
         System.out.println("Age :"+age);
    }
}
// Default Constructor:

//  Write a program to create a class Person with a default constructor that initializes name to "Unknown" and age to 0.