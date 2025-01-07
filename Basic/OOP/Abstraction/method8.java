public class method8 {
    
    public static void main(String[] args) {
        B b=new B();
        b.show("prem");
        b.display(9);
    }
}

abstract class A
{
     String  show(String name)
     {
        System.out.println(name);
        return name;

     }

     abstract void display(int a);
}
class B extends A
{
       void display(int a)
       {
        System.out.println(a);
       }
      

}
