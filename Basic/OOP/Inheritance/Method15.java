public class Method15 {
    public static void main(String[] args) {
        B b=new B();
        b.show();
        b.show2(3);
    }
}
class A
{
     private int a;
     void show()
     {
        this.a=a;
        System.out.println(a);
     }

     int getA()
     {
        return a;
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
// 	private instance variable 

// B 
// 	access