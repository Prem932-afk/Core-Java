
// 12.Constructor with a String and an Integer:

// Write a class Employee with name and salary as instance variables. Create a constructor that accepts both a String for name and an int for salary.

class C12 
{
 public static void main(String[] args) 
 {
     Employee e=new Employee("Rahul", 10000);
     e.display();
 }    
}

class Employee
{
    String name;
    int salary;

    Employee(String name, int salary)
    {
        this.name=name;
        this.salary=salary;
    }

    void display()
    {
        System.out.println("Employe Name : " + name);
        System.out.println("Employe Salary : " + salary);
    }
}
