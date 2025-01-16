public class ConstrucotrSheet13 
{
   public static void main(String args[]) 
   {
     Person p=new Person();
     p.display();
     
   }    
}
class Person
{
    String name;
    int age;
    public Person()
    {
         name="John";
         age=25;
       
    }
    public void display()
    {
        System.out.println("Name :"+name);
        System.out.println("Age : "+age);
     
    }
}

//Constructor for Initialization:

//Write a class Person with a constructor that initializes the name to "John" and age to 25. Create an object and display these values.

