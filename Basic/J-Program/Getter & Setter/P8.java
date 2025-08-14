//8)
//Getter and Setter with Validation
//Create a class Student with fields name (String) and marks (double). Write setter methods with validation to ensure that marks cannot be set to values less than 0 or greater than 100.


class P8
{
    public static void main(String[] args) 
    {
        Student s=new Student();
          s.setName("Aditya");
          s.setMarks(344);

          System.out.println(s.getName());
          System.out.println(s.getMarks());
    }
}
class Student
{
    private String name;
    private double marks;

    void setName(String name)
    {
        this.name=name;
    }

    String getName()
    {
        return name;
    }

    void setMarks(double marks)
    {
        if(marks >0 && marks <100)
        {
            this.marks=marks;
        }
        else
        {
            System.out.println("Invalid marks");
        }
    }

    double getMarks()
    {
        return marks;
    }

}