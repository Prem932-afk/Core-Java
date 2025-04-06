
// Simple Constructor Example:

// Write a class Person with instance variables name and age. Create a constructor that initializes these values and a method displayDetails() that prints the values.

public class P17 
{
    public static void main(String[] args) 
    {
         Person p =new Person();
         p.displayDetails();
    }
}
class Person 
{
    String name;
    int age;
    Person ()
    {
        this.name="Rahul";
        this.age=33;

    }
    void displayDetails()
    {
        System.out.println(name);
        System.out.println(age);
    }
}
