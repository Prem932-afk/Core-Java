//10)
//Default Values with Getter and Setter
//Create a class Student with a private field marks (int). Write a setter method that sets the value and a getter that returns the value, ensuring the default marks value is 0.
class P10 
{
    public static void main(String[] args) 
    {
        Student s = new Student();
        
       
        System.out.println("Default marks: " + s.getMarks());

       
        s.setMarks(85);
        System.out.println("Updated marks: " + s.getMarks());
    }
}

class Student 
{
    private int marks; 

    public void setMarks(int marks) 
    {
        this.marks = marks;
    }


    public int getMarks() 
    {
        return marks;
    }
}
