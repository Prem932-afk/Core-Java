//Q.1)

//Basic Getter and Setter.

//Create a class Person with two fields: name (String) and age (int). Write getter and setter methods for bot

class P1
{
    public static void main(String args[])
    {
       Person p=new Person();
         p.setName("Sohan");
         p.setAge(20);
         System.out.println(p.getName());
         System.out.println(p.getAge());
    }
}
class Person 
{
    private String name;
    private int age;

    void setName(String name)
    {
        this.name=name;
    }

    String getName()
    {
        return name;
    }

     void setAge(int age)
    {
        this.age=age;
    }

    int getAge()
    {
        return age;
    }
}