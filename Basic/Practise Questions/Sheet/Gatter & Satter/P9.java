//9)
//Setter with Argument Validation
//Create a class Person with a private field age (int). Write a setter that ensures the age is greater than 0 and less than 130, throwing an exception if invalid.
class P9
{
    public static void main(String[] args) 
    {
          Person p=new Person();
        try 
        {
            p.setAge(-5); // Valid age
            System.out.println(p.getAge());
            
        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

class Person
{
    private int age;

    void setAge(int age)
    {
        if(age>0 && age<130)
        {
            this.age=age;
        }
        else
        {
            throw new IllegalArgumentException("Invalid age. Age must be between 1 and 129.");
        }
    }

    int getAge()
    {
        return age;
    }
}