// Q.7 Multilevel Inheritance Example

public class I7 
{
    public static void main(String[] args) 
    {
        Executive e = new Executive("IT", "Prem", 28, "Senior Executive");
        e.display();
    }
}

class Employee
{
    private String name;
    private int age;

    Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    String getName()
    {
        return name;
    }

    int getAge()
    {
        return age;
    }

    void display()
    {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

class Manager extends Employee
{
    private String department;

    Manager(String department, String name, int age)
    {
        super(name, age);
        this.department = department;
    }

    void display()
    {
        super.display();
        System.out.println("Department : " + department);
    }
}

class Executive extends Manager
{
    private String role;

    Executive(String department, String name, int age, String role)
    {
        super(department, name, age);
        this.role = role;
    }

    void display()
    {
        super.display();
        System.out.println("Role : " + role);
    }
}