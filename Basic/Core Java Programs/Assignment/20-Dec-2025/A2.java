// class A
// 	constructor 
// 	method :
// 	no return and no argument 
// 	return and argument 
// 	return and no argument 

// 	call two ways : 

class A2
{
    public static void main(String[] args) 
    {
        new A();
        A a = new A();
         a.method();
         a.method2(6);
         System.out.println(a.method3());
    }
}
class A
{
    A()
    {
        System.out.println("Constructure");
    }

    void method()
    {
        System.out.println("Method");
    }

    int method2(int n)
    {
        System.out.println(n);
        return n;
    }

    int method3()
    {
        int n=10;
        System.out.println(n);
        return n;
    }
}