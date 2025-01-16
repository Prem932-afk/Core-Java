
class Program8 
{
    public static void main(String[] args)
     {
        student s=new student("prem",39);
        System.out.println("Student id : "+s.getMarks());
        System.out.println("Student name :"+s.getName());    
    }
}

class student
{
    private double marks;
    private String name;

    student(String name, double marks)
    {
            this.name=name;
            this.marks=marks;
            if(marks<=0)
            {
                System.out.println("zero");
            }
            else if(marks>=0 && marks<=100)
            {
                System.out.println("Marks is less then 100");
            }
            else
            {
                System.out.println("Marks is greter then 100");
            }
    }

    double getMarks()
    {
        return marks;
    }
     
    String getName()
    {
        return name;
    }
}

//Getter and Setter with Validation.

//Create a class Student with fields name (String) and marks (double).
// Write setter methods with validation to ensure that marks cannot be set to values less than 0 or greater than 100.
