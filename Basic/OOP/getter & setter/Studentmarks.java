 class Studentmarks {
 public static void main(String[] args) {
    Student s=new Student(0, "Alice");
    System.out.println("Name :"+s.getName());
    System.out.println("marks"+s.getMarks());
 }   
}

class Student
{
    private double marks;
    private String name;
    Student(double marks,String name)
    {
             this.marks=marks;
             this.name=name;
             if(marks >0 && marks <=100)
             {
                System.out.println("Your marks :"+this.marks);
             }
             else
             {
                System.out.println("invalid");
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