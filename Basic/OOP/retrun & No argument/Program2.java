public class Program2 
{
 public static void main(String[] args) 
 {
      A a=new A();
       a.show();

      B b=new B();
       b.show2();
 }    
}
class A
{
     String show()
     {
        String name="Prem";
        System.out.println("Name:"+name);
        return name;
     }
}
class B
{
      B show2()
      {
         System.out.println("Covarient return type");
         return this;
      }
}

// A class 
// 	string 

// B class
// 	covariant return type 
// 	welcome to india 

