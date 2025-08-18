// 9)
// Create a program where a Person class is inherited by a Student class, which is then inherited by a GraduateStudent class.

class Person 
{
    String name;

    void show(String name) 
    {
        this.name = name;
    }
}

class Student extends Person 
{
    void display() 
    {
        System.out.println("Name: " + name);
    }
}

class GraduateStudent extends Student 
{
    public static void main(String[] args) 
    {
        GraduateStudent gs = new GraduateStudent();  // 👈 Correct object
        gs.show("Rahul");      // From Person
        gs.display();          // From Student
    }
}
