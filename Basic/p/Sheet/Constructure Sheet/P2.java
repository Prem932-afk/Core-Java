// Q.2)
 
// Default Constructor:

// Write a program to create a class Person with a default constructor that initializes name to "Unknown" and age to 0.


public class P2 
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
        String name="Unknown";
        int age=0;
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
   }
}
