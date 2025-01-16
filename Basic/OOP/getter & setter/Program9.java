public class Program9 
{
  public static void main(String[] args) 
  {
     Person p=new Person(22);
     System.out.println("Persona age"+p.getAge());
  }    
}
class Person
{
    private int age;
    
    Person(int age)
    {
        this.age=age;
        if(age>=0 && age<18)
        {
            System.out.println("person Age :"+age);
        }
    }
    
    int getAge()
    {
        return age;
    }

}
//Setter with Argument Validation.

//Create a class Person with a private field age (int). Write a setter that ensures the age is greater than 0 and less than 30, throwing an exception if invalid.

