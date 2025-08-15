// Q.12)
 
// Constructor with Default Values:

// Create a Student class with instance variables name and marks. Write a constructor that initializes name to "Unknown" and marks to 0 by default.
 




public class P12 
{
    public static void main(String[] args) 
    {
        new Student(0,"Unknown");
    }    
}
class Student 
{
        int marks;
        String name;
        Student(int marks, String name)
        {
            this.marks=marks;
            this.name=name;
        }
}