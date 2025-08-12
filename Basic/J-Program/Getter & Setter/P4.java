//Q.4)
 
//Validation in Setter.

//In the Employee class, create a setter for the salary field (double). Ensure that the salary cannot be set to a negative value. If the value is invalid, set it to 0.


class P4
{
    public static void main(String[] args) 
    {
         Employee e=new Employee();
           e.setSlary(30000);
           System.out.println(e.getSalary());
    }
}

class Employee
{
 private double salary;

 void setSlary(double salary)
 {
       if(salary<0)
       {
          this.salary=0;
       }
       else
       {
          this.salary=salary;
       }
 }

 double getSalary()
 {
    return salary;
 }
}