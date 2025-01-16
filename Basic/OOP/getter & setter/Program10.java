 class Student
{
 
  private int marks = 0;

  
   void setMarks(int marks) 
  {
      this.marks = marks;
  }

 
   int getMarks() 
   {
      return this.marks;
  }
}

  class Program10 
  {
   public static void main(String[] args) 
   {
     
      Student student = new Student();

     
      System.out.println("Initial Marks: " + student.getMarks());

     
      student.setMarks(85);

      
      System.out.println("Updated Marks: " + student.getMarks());
   }
}

//Default Values with Getter and Setter.

//Create a class Student with a private field marks (int). Write a setter method that sets the value and a getter that returns the value, ensuring the default marks value is 0.
