

// Q.2)
 
// Default Constructor:

// Write a program to create a class Person with a default constructor that initializes name to "Unknown" and age to 0.

public class C2 
{
  public static void main(String args[])
  {
       new Person();
  }    
}
class Person
{
   Person()
   {
     String name="Unknow";
     int age=18;
     System.out.println("Name : "+name);
     System.out.println("Age : "+age);
   } 
}


