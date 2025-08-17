
//  Q.1 Write a Java program to demonstrate single-level inheritance where a Student class inherits from a Person class.

class P1
{
    public static void main(String args[])
    {
           Student s=new Student("3344", "Prem", 23);
           s.displyStudentdetails();
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

     void displydetails()
     {
        System.out.println("Person name :"+name);
        System.out.println("Person age :"+age);
     }
}
class Student extends Person
{
    
      String id;
      Student(String id,String name,int age)
     {
       super(name,age);
       this.id=id;
     }

     void displyStudentdetails()
     {
         displydetails();
         System.out.println("Student id"+id);
     }
}