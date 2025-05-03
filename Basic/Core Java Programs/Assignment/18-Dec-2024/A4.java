//Q.4
// A class
// 	string

// B class
// 	covariant return type
// 	welcome to india
	
class A4
{
    public static void main(String[] args) 
    {
        A a =new A();
         a.method1();
         a.method2();
    }
}

class A
{
    String method1()
    {
        String name="Prem";
        System.out.println(name);
        return name;
    }

    A method2()
    {
        System.out.println("Coveriant Datatyoe");
        return this;
    }
}