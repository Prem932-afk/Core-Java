// 10)
// Constructor with Integer Parameter:

// Write a class Employee with an integer instance variable salary. Create a constructor that takes an integer and sets the salary value.


public class P10 
{
         Employee e = new Employee(10000);
}

class Employee 
{
    int Salary;
    Employee(int Salary)
    {
        this.Salary=Salary;
        System.out.println("Slary : " + Salary);
    }
}