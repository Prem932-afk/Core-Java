//Write a Java program to demonstrate single-level inheritance where a Student class inherits from a Person class.

class Program1
{
     public static void main(String[] args) 
     {
        student s=new student();
        s.student("1001","Rahul",16);
        s.DisplayPersonDetails();
        s.DisplayStudentDetails();
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

    void DisplayPersonDetails()
    {
        System.out.println("Student name :"+name);
        System.out.println("Student age :"+age);
    }
}

class student extends Person
{
     String id;
     void student(String id,String name, int age)
     {
        this.id=id;
        this.name=name;
        this.age=age;
       
     }
     
     void DisplayStudentDetails()
     {
        System.out.println("Studen id :"+id);
     }
}