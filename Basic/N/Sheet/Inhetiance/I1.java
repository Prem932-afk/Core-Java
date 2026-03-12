// Q.1 Write a Java program to demonstrate single-level inheritance

class I1
{
    public static void main(String args[])
    {
        Student s1 = new Student("101","Prem",28);
        
    }
}

class Person
{
    String name;
    int age;

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void display()
    {
        System.out.println("Student Name : " + name);
        System.out.println("Student Age : " + age);
    }
}

class Student extends Person
{
    String id;

    Student(String id, String name, int age)
    {
        super(name, age);   // parent constructor call
        this.id = id;
    }

    void displyStudentdetails()
    {
         display();
         System.out.println("Student id"+id);
     }
}