public class Method7 {
    public static void main(String[] args) {
         A a=new A();
         a.m5();
    }

}
class A
{
     void m1()
     {
        System.out.println("M1 method");
     }
     void m2()
     {
        m1();
        System.out.println("M2 method");
     }
     void m3()
     {
        m2();
        System.out.println("M3 method");
     }
     void m4()
     {
        m3();
        System.out.println("M4 method");
     }
     void m5()
     {
        m4();
        System.out.println("M5 method");
     }
     
}
// A 
// 	m1

// 	m2
	
// 	m3

// 	m4

// 	m5 
// method chaining 