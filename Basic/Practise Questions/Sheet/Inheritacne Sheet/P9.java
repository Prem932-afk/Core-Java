// 9)
// Create a program where a Person class is inherited by a Student class, which is then inherited by a GraduateStudent class.

// Base class

// Main class
public class P9 
{
    public static void main(String[] args) 
    {
        GraduateStudent gs = new GraduateStudent();
        gs.setName("Alice");
        gs.setRollNo(101);
        gs.setResearch("AI");

        gs.showGraduate();
    }
}

class Person 
{
    String name;

    void setName(String name) 
    {
        this.name = name;
    }

    void showPerson() 
    {
        System.out.println("Name: " + name);
    }
}

// Student class inherits Person
class Student extends Person 
{
    int rollNo;

    void setRollNo(int rollNo) 
    {
        this.rollNo = rollNo;
    }

    void showStudent() 
    {
        showPerson();
        System.out.println("Roll No: " + rollNo);
    }
}

// GraduateStudent class inherits Student
class GraduateStudent extends Student 
{
    String research;

    void setResearch(String research) 
    {
        this.research = research;
    }

    void showGraduate() 
    {
        showStudent();
        System.out.println("Research Topic: " + research);
    }
}

