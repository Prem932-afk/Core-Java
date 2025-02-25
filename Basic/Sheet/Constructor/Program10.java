public class Program10 
{
  public static void main(String[] args) 
  {
     new Employee(22000);
  }    
}

class Employee
{
     int salary;
     Employee(int salary)
     {
        this.salary=salary;
        System.out.println("Employe Salary :"+salary);
     }
}
//10)
// Constructor with Integer Parameter:

// Write a class Employee with an integer instance variable salary. Create a constructor that takes an integer and sets the salary value.
