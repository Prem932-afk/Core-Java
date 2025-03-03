// Q.1  Basic Getter and Setter.

//Create a class Person with two fields: name (String) and age (int). Write getter and setter methods for both fields.

class Program1
{
    public static void main(String[] args) 
    {
        Person p=new Person("prem", 22);
        System.out.println("Person Name :"+p.getName());
        System.out.println("Person age :"+p.getAge());
    }
}
class Person
{
     private String name;
     private int age;
     Person(String name, int age)
     {
        this.name=name;
        this.age=age;
     }

     String getName()
     {
        return name;
     }

     int getAge()
     {
        return age;
     }
}