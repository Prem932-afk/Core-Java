public class ConstructorSheet5 
{
  public static void main(String[] args) 
  {
     new Student();
  }    
}
class Student
{
          Student()
          {
             String name="Anonymous";
             int marks=20;
             System.out.println("Name :"+name);
             System.out.println("Marks :"+marks);
          }
}
// No-Argument Constructor:

// Define a class Student with a no-argument constructor that initializes name to "Anonymous" and marks to 0.
