public class Sheet2to1 
{
    public static void main(String[] args) 
    {
        Student s = new Student();
         s.person("Rahul", 20);
         s.student("Ronit");
         s.studenDetails();
    }
}

class Person
{
    String name;
    int age;
    void person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    
}
class Student extends Person
{
     String name;
     void student(String name)
     {
        this.name=name;
     }

     void studenDetails()
     {
        PersonDetails();
        System.out.println("Student Name :"+name);
     }
}
//Write a Java program to demonstrate single-level inheritance where a Student class inherits from a Person class.
