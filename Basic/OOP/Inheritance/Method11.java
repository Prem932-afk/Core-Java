public class Method11 {
    public static void main(String[] args) {
         D d=new D();
         d.show(3);
         d.show2();
         d.show3();
         d.show4(2);

    }
}
class A
{
     int show(int a)
     {
          a=a;
          System.out.println(a);
          return a;
     }
}
class B extends A
{
       int show2()
     {
          int a=10;
          System.out.println(a);
          return a;
         
     }
}
class C extends B
{
     void show3()
     {
          int a=10;
          System.out.println(a);
          
     }
}
class D extends C
{
     void show4(int a)
     {
          a=a;
          System.out.println(a);
          
     }
}




// multilevel inheritance :
// A 
// 	method1 :return and argument :covariant 

// B 
// 	method2 :return and no argument 

// C
// 	method3:no return and no argument 

// D
// 	method4 :no return and argument 

// child k through access 