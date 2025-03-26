// 7)
// Create a program where a Manager class inherits from an Employee class, and an Executive class inherits from Manager. Display the details for all three classes.

public class P7 
{
  public static void main(String[] args) 
  {
    Executive e= new Executive(33, "Rohan", 22, "mark", "ai");
    e.showDetails();
  }    
}
class Employee
{
    private int id;
    private String name;
    private int age;
    Employee(int id, String name, int age)
    {
        this.id=id;
        this.name=name;
        this.age=age;
    }
    int getId()
    {
        return id;
    }
    String getName()
    {
        return name;
    }
    int age()
    {
        return age;
    }
    void details()
    {
        System.out.println(age);
        System.out.println(name);
        System.out.println(id);
    }
}
class Manager extends Employee 
{
    private String department;

    public Manager(int id, String name,  int age, String department) 
    {
        super( id,name, age);  
        this.department = department;
    }

  
    String getDepartment() 
    {
        return department;
    }
    void showDetails() 
    {
        super.details();  
        System.out.println("Manager's Department: " + department);
    }
}
class Executive extends Manager 
{
    private String executiveLevel;

    Executive(int id,String name,int age, String department, String executiveLevel) 
    {
        super(id,name, age, department);  
        this.executiveLevel = executiveLevel;
    }

  
    String getExecutiveLevel()
    {
        return executiveLevel;
    }

  
    public void showDetails() 
    {
        super.showDetails();  
        System.out.println("Executive Level: " + executiveLevel);
    }
}
