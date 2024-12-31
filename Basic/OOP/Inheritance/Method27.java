
class Employee 
{
    String name;
    int id;
    double salary;

  
    void employee(String name, int id, double salary) 
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: $" + salary);
    }
 
}
class Manager extends Employee 
{
    String department;

   
    void manager( String department) 
    {
       
        this.department = department;
        System.out.println("Manager's Department: " + department);
    }

   
}


class Executive extends Manager 
{
    String executiveLevel;

   
    void executive( String executiveLevel) 
    {
     
        this.executiveLevel = executiveLevel;
        System.out.println("Executive Level: " + executiveLevel);
    }

   
}


class Method27 
{
    public static void main(String[] args) 
    {
       Executive e=new Executive();
       e.executive("2");
       e.manager("shubam");
       e.employee("shubam", 55, 10000);
      
    }
}
