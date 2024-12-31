
class Person 
{
    String name;
    int age;

   
    void person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    
     void displayDetails() 
     {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Student extends Person 
{
    String studentID;

   
    void student(String studentID) 
    {
       
        this.studentID = studentID;
        System.out.println("Student ID: " + studentID);
    }


}


class GraduateStudent extends Student 
{
    String thesisTopic;

   
    void graduateStudent( String thesisTopic) 
    {
        
        this.thesisTopic = thesisTopic;
        System.out.println("Thesis Topic: " + thesisTopic);
    }

  
}


class Method29
 {
    public static void main(String[] args) 
    {
       GraduateStudent g=new GraduateStudent();
       g.graduateStudent("A");
       g.student("55");
       g.person("Shubam", 33);
       g.displayDetails();
    }
}
