public class method3 {

 public static void main(String[] args) {
    B b=new B();
    b.method(2,3);
  
 }
}
class A
{
    void method(int a)
    {
        System.out.println("first method");
    }
}
class B extends A
{
    void method(int a,int b)
    {
     System.out.println("second method");
    }
}
