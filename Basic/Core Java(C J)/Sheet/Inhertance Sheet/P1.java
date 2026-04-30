
//  Q.1 Write a Java program to demonstrate single-level inheritance where a Student class inherits from a Person class.


import java.util.*;
class P1 
{
    public static void main(String args[])
    {

         Student s=new Student("1003", "Rahul", 25);

          s.display();
    }
}

class Person
{
    String name;
    int age;

    Person(String name, int age)
    {
         this.name=name;
         this.age=age;

    }

    void display()
    {
        System.out.println("Student Name : " + name);
        System.out.println("Student age : " + age);    
    }

}

class Student extends Person 
{
    String id;

    Student(String id, String name, int age)
    {
        super(name, age);
        this.id=id;
    }

    void display()
    {
        super.display();
        System.out.println("Student id : " + id);
    }
}