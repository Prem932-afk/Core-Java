 
// A class 
// string 

// B class
// covariant return type 
// welcome to india 





public class A2 
{
public static void main(String[] args) 
{
 A a=new A();
  a.show("Method 1");
  a.show("Welcome to india");
}    
}
class A
{
  String show(String name )
  {
      System.out.println("Name :"+name);
      return name;
  }
}
class B
{
  B show2(String name)
  {
    System.out.println(name);
    return this;
  }
}
