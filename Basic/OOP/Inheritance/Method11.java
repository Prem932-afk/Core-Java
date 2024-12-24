class Method11 {
    public static void main(String[] args) {
        D d=new D();
        d.method1();
        d.method2();
        d.method3();
        d.method4();
    }
}
class A
{
    void method1()
    {
        System.out.println("method 1");
    }
}
class B extends A
{
    void method2()
    {
        System.out.println("method 2");
    }
}
class C extends B
{
    void method3()
    {
        System.out.println("method 3");
    }
}
class D extends C
{
    void method4()
    {
        System.out.println("method 4");
    }
}



// getter and setter method :
// multilevel inheritance :
// A 
// 	method1

// B 
// 	method2 

// C
// 	method3

// D
// 	method4 
// child k through access 