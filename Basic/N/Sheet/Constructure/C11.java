
// 11.Constructor for Initialization:

// Write a class Person with a constructor that initializes the name to "John" and age to 25. Create an object and display these values.
class C11
{
    public static void main(String[] args) 
    {
        Person p = new Person();
        p.display();
    }
}

class Person 
{
    String name;
    int age;

    Person()
    {
        this.name = "John";
        this.age = 25;
    }

    void display()
    {
        System.out.println("Person name : " + name);
        System.out.println("Person age : " + age);
    }
}