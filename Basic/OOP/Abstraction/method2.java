public class method2 {
    public static void main(String[] args) {
        B p=new B();
        p.show(3);
        p.display("Hello");
    }
}
abstract class A
{
    abstract void show(int a);

    abstract String display(String name);
}
class B extends A
{
       void show(int a)
       {
              System.out.println(a);
       }

       String display(String name)
       {
             System.out.println(name);
             return name;
       }
}
// abstract class 
// 	method2 :abstract type :no return and  argument
// 	method4 :abstract type : return and  argument
