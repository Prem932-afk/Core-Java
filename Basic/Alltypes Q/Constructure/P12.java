
// 12)
// Constructor with Default Values:

// Create a Student class with instance variables name and marks. Write a constructor that initializes name to "Unknown" and marks to 0 by default.
public class P12 
{
    public static void main(String[] args) 
    {
          Student s = new Student();
             
    }
}
class Student
{
    String name;
    String marks;
    Student()
    {
        this.name="Unknown";
        this.marks="0";
        System.out.println("Student Name : "+ name);
        System.out.println("Student marks : "+ marks);
    }
}
