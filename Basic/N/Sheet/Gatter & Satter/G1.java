//Q.1)

//Basic Getter and Setter.

//Create a class Person with two fields: name (String) and age (int). Write getter and setter methods for both.


class G1 
{
     public static void main(String[] args) 
     {
           Person p=new Person("Rahul", 18);  

           System.out.println(p.age);
           System.out.println(p.name);
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
