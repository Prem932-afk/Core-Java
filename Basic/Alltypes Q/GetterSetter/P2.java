// Q.2)

// Constructor with Getter and Setter

// Create a class Student with fields id (int) and name (String). Initialize these fields using a constructor and then write getter and setter methods.


class Program2
{
 public static void main(String[] args) 
 {
    Student s=new Student();
    System.out.println("Studen name :"+s.getName());
    System.out.println("Student ID"+s.getId());
 }   
}

class Student
{
    private String id;
    private String name;
    void setstudent(String id,String name)
    {
             this.name=name;
             this.id=id;
    }
    
    String getId()
    {
        return id;
    }

    String getName()
    {
        return name;
    }
        
}

