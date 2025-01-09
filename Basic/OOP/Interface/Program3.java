public class Program3 
{
  public static void main(String[] args) 
  { 
    B b=new B();
     b.show();
     b.show2(2);
     
  }    
}

interface A 
{
    
    default void show2(int a)
    {
        System.out.println("default no return and  argument "+a);
        show3(3);
        show4("Prem");
    }
   

    private int show3(int a)
    {
        System.out.println("private return and no argument ");
        return a;
    }

    private String show4(String name)
    {
        System.out.println("private return and argument ");
        return name;
    }

} 
class B implements A
{
    void show()
    {
        System.out.println("no return and no argument" );
    }
}

// interface : 
// 	method1 :no return and no argument 
// 	method2:default no return and  argument 
// 	method3:private return and no argument 
// 	method4 :private return and argument 

// another class access 
