// Q.14)
 
// Constructor with a String and an Integer:

// Write a class Employee with name and salary as instance variables. Create a constructor that accepts both a String for name and an int for salary.


public class P14
{
  public static void main(String[] args) 
  {
      Employee e=new Employee("Prem", 20000);
  }    
}
class Employee
{
     String name;
     double salary;

     Employee(String name, double salary)
     {
         this.name=name;
         this.salary=salary;
         System.out.println("Name :"+name);
         System.out.println("Salary :"+salary);
     }
}