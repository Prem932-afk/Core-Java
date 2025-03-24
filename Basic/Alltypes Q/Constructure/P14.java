// 14)
// Constructor with a String and an Integer:

// Write a class Employee with name and salary as instance variables. Create a constructor that accepts both a String for name and an int for salary.

public class P14 
{
    public static void main(String[] args) 
    {
        Employee e=new Employee("Rohan", 33);     
    }
    
}
class Employee
{
    String name;
    int Salary;
    Employee(String name, int salary)
    {
        this.name=name;
        this.Salary=salary;
        System.out.println("Employe Name : "+name);
        System.out.println("Employe Salary : "+ salary);
    }
}
