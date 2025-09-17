//Q.1 Write a Java program to demonstrate single-level inheritance where a Student class inherits from a Person class.

class p1
{
  public static void main(String[] args) 
  {
       Student s=new Student("Rahul", 19, "101");
        s.StudentDetails(); 
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
        System.out.println("Person Name : " + name);
        System.out.println("Person Age : "+ age);
    }
}

class Student extends Person
{
    String Id;

    Student(String name, int age, String Id)
    {
        super(name, age);
        this.Id=Id;    

    }

    void StudentDetails()
    {
        display();
        System.out.println("Student Id : " + Id);
    }
}