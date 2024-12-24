 class Method6 {
 public static void main(String[] args) {
    D d=new D();
    d.show3();
    d.add(3, 5);
    d.dis();
    d.show4();
    d.dis2();
 }
      

}
class A
{
     void show()
     {
        System.out.println("show");
     }
}
class B extends A
{
     void show2()
     {
        System.out.println("show2");
     }
}
class C extends B
{
     void show3()
     {
        System.out.println("show");
     }

     int add(int a, int b)
     {
           a=a;
           b=b;
        int add=a+b;
        System.out.println("Adition");
        return add;
     }
     void dis()
     {
        A a=new A();
        a.show();
     }
}
class D extends C
{
     void show4()
     {
        System.out.println("show4");
     }
    void dis2()
    {
        B b=new B();
         b.show2();
    }
}
// A 
// 	method1

// B 
// 	method2

// C
// 	method3
// 		object :A  
// 	method5 :return and argument 

// D 
// 	method4
// 		object :B 

// access 