public class method7 {
    public static void main(String[] args) {
        B b=new B();
        b.show();
        b.display();
    }
}

abstract class A
{
     void show()
     {
        System.out.println("hello");
     }

     abstract int display();
}
class B extends A
{
       int display()
       {
        System.out.println("8");
         return 8;
       }
      

}