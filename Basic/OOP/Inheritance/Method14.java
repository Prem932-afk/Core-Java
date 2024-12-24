public class Method14 {
    public static void main(String[] args) {
        B b=new B();
        b.show(2);
        b.show2(3);
    }
}
class A
{
     int a;
     void show(int a)
     {
        a=a;
        System.out.println(a);
     }
}
class B extends A
{
     int a;
     void show2(int a)
     {
        a=a;
        System.out.println(a);
     }
}
// through single level inheritance 

// A
// 	instance variable 

// B 
// 	access