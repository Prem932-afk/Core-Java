// 8)
// Constructor and Method:

// Create a class Person with name and age as instance variables. Use a constructor to initialize these values, and then write a method displayInfo() that prints the name and age.


public class P8 
{
 public static void main(String[] args) 
 {
       Person p = new Person("Prem", 23);
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

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}