// 9)Create a program where a Person class is inherited by a Student class, which is then inherited by a GraduateStudent class.
// Multilevel Inheritance Example

class P9 
{
    public static void main(String[] args) 
    {
        
        GraduateStudent gs = new GraduateStudent("Rahul", 24, "CS101", "MCA");
        
        gs.showDetails();
    }
}

// Base class
class Person 
{
    String name;
    int age;

    Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
}

// Derived class (Level 1)
class Student extends Person 
{
    String studentId;

    Student(String name, int age, String studentId) 
    {
        super(name, age);
        this.studentId = studentId;
    }
}

// Derived class (Level 2)
class GraduateStudent extends Student 
{
    String degree;

    GraduateStudent(String name, int age, String studentId, String degree) 
    {
        super(name, age, studentId);
        this.degree = degree;
    }

    void showDetails() 
    {     
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
        System.out.println("Degree: " + degree);
    }
}