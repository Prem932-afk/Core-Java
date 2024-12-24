public class CheckSalary {
    public static void main(String[] args) {
         Employe e= new Employe(-999);
         System.out.println("Salary"+e.getSalary()); 
    }
}
class Employe
{
    private double salary;
    Employe(double salary)
    {
          if(salary<0)
          {
            this.salary=salary;
            System.out.println("Salary is 0");
          }
          else
          {
            this.salary=salary;
            System.out.println("Salary :"+this.salary);
          }
    }

    double getSalary()
    {
        return salary;
    }
    
}
