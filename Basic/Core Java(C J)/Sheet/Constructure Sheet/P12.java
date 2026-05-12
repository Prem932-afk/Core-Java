// 12)
// Constructor with Default Values:

// Create a Student class with instance variables name and marks. Write a constructor that initializes name to "Unknown" and marks to 0 by default.

class P12
{
    public static void main(String[] args)
    {
        // Creating object
        Student s1 = new Student();

        // Displaying values
        s1.display();
    }
}

class Student
{
    String name;
    int marks;

    // Default Constructor
    Student()
    {
        name = "Unknown";
        marks = 0;
    }

    // Display Method
    void display()
    {
        System.out.println("Student Name  : " + name);
        System.out.println("Student Marks : " + marks);
    }
}