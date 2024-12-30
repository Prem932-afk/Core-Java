class Method21
{
    public static void main(String[] args) {
        Student s=new Student();
        s.person(19,"Abhi");
        s.persondetails();
        s.student("s1234");
        s.Studentdetail();
    }
}
class Person
{
     int age;
     String name;
    void person(int age, String name)
    {
           this.age=age;
           this.name=name;
    }
    void persondetails()
    {
        System.out.println("Person age :"+age);
        System.out.println("Person Name :"+name);
    }
}
class Student extends Person
{
    String id;
    void student(String id)
    {
        this.id=id;

    }
    void Studentdetail()
    {
        System.out.println("Student id :"+id);
    }
}