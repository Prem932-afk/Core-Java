public class Program8 
{
  public static void main(String[] args) 
  {
     Person p=new Person("ravi", 45);
     p.displayInfo(); 
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
    void displayInfo()
    {
        System.out.println("Person Name :" +name);
        System.out.println("Person age :" +age);
    }
}
// 8)
// Constructor and Method:

// Create a class Person with name and age as instance variables. Use a constructor to initialize these values, and then write a method displayInfo() that prints the name and age.
