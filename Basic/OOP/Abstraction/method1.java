abstract class A
{
     abstract void show();

     abstract int display();
}
class B extends A
{
     void show()
     {
         System.out.println(" no return & no argument");
     }

     int display()
     {
        System.out.println("3");
        return 3;
     }


}
class method1
{
    public static void main(String[] args) 
    {
          B p=new B();
          p.show();
          p.display();    
    }
}
// abstract class 
// 	method1 :abstract type :no return and no argument 
// 	method3 :abstract type : return and no argument

// abstract class 
// 	method2 :abstract type :no return and  argument
// 	method4 :abstract type : return and  argument

// another class extends 

// access through child class 


// abstract class A{
//     abstract void show();
// }
// class B extends A{
//     //define : 
//     void show(){
//         System.out.println("abstract class ");
//     }
//     void display(){
//         System.out.println("display");
//     }
// }
// public class AbstractBasic2 {
//     public static void main(String[] args) {
//         B p=new B();
//         p.show();
//         p.display();
//     }
// }