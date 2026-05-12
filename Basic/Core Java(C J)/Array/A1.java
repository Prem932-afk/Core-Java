import java.util.*;

class A1
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);

       // First Employee
       System.out.println("Enter Employee Id");
       int id1 = sc.nextInt();

       System.out.println("Enter Employee Age");
       int age1 = sc.nextInt();

       Employe e1 = new Employe(id1, age1);

       // Second Employee
       System.out.println("Enter Employee Id");
       int id2 = sc.nextInt();

       System.out.println("Enter Employee Age");
       int age2 = sc.nextInt();

       Employe e2 = new Employe(id2, age2);

       // Array of Employee objects
       Employe arr[] = new Employe[2];

       arr[0] = e1;
       arr[1] = e2;

       // Display Data
       for(int i = 0; i < arr.length; i++)
       {
           System.out.println("Employee Id : " + arr[i].getId());
           System.out.println("Employee Age : " + arr[i].getAge());
       }
    }
}

class Employe
{
     private int id;
     private int age;

     // Constructor
     Employe(int id, int age)
     {
          this.id = id;
          this.age = age;
     }

     void setAge(int age)
     {
         this.age = age;
     }

     int getAge()
     {
         return age;
     }

     void setId(int id)
     {
        this.id = id;
     }

     int getId()
     {
        return id;
     }
}