
// multilevel inheritance :
// A
// A()
// {}
// static

// B
// A()
// {}
// static


// C
// A()
// {}
// static

// D
// A()
// {}
// static



class A{
    //default constructor
    A(){
        System.out.println("Hello");
    }
    //anonymous block
    {
        System.out.println("Hii");
    }
    //static block
    static{
        System.out.println("Jeevan Pareek");
    }
}
class B extends A{ 
    //default constructor
    B(){
        System.out.println("Hello");
    }
    //anonymous block
    {
        System.out.println("Hii");
    }
    //static block
    static{
        System.out.println("Jeevan Pareek");
    }
}
class C extends B{
    //default constructor
    C(){
        System.out.println("Hello");
    }
    //anonymous block
    {
        System.out.println("Hii");
    }
    //static block
    static{
        System.out.println("Jeevan Pareek");
    }
}
class D extends C{
    //default constructor
    D(){
        System.out.println("Hello");
    }
    //anonymous block
    {
        System.out.println("Hii");
    }
    //static block
    static{
        System.out.println("Jeevan Pareek");
    }
}
public class Program8 {
    public static void main(String[] args) {
        // D p = new D();
        // p.

        new D();
    }    
}

