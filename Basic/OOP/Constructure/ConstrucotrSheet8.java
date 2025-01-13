public class ConstrucotrSheet8 
{
  public static void main(String[] args) 
  {
     Person p=new Person("Sohan", 44);
     p.displayInfo();
  }    
}
class Person
{
       String name;
       int age;
       Person(String name, int age)
       {
         this.name=name;
         this.age=age;
       }

       void displayInfo()
       {
          System.out.println("Person Name :"+name);
          System.out.println("Person Age :"+age);
       }
}
//Constructor and Method:

//Create a class Person with name and age as instance variables. Use a constructor to initialize these values, and then write a method displayInfo() that prints the name and age.
