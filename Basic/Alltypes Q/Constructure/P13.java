// 13)
// Constructor for Initialization:

// Write a class Person with a constructor that initializes the name to "John" and age to 25. Create an object and display these values.

public class P13 
{
     public static void main(String[] args) 
     {
             Person p =new Person();  
     }
}
class Person
{
     Person()
     {
        String name="john";
        int age=25;
        System.out.println(" Person Name : "+name);
        System.out.println("Person Age : "+age);
     }  
}