// Q.2)

// Constructor with Getter and Setter

// Create a class Student with fields id (int) and name (String). Initialize these fields using a constructor and then write getter and setter methods.

class Demo
{
    public static void main(String[] args) 
    {
         Student s=new Student(222, "Shubam");
          s.setId(0);
          s.getName();
         System.out.println(s.getId());
         System.out.println(s.getName());
    }
}

class Student
{
    private int id;
    private String name;

    Student(int id, String name)
    {
        this.id=id;
        this.name=name;
    }

    void setId(int id)
    {
       this.id=id;
    }

    int getId()
    {
        return id;
    }

    void setName(String name)
    {
        this.name=name;
    }

    String getName()
    {
        return name;
    }
}