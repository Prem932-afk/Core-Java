class Method12 {
    public static void main(String[] args) {
        D d=new D();
       
    }
}
class A
{
    A()
    {
        System.out.println("Constructure 1");
    }
}
class B extends A
{
    B()
    {
        System.out.println("Constructure 2");
    }
}
class C extends B
{
    C()
    {
        System.out.println("Constructure 3");
    }
}
class D extends C
{
    D()
    {
        System.out.println("Constructure 4");
    }
}



// multilevel inheritance :normal statement 
// A 
// 	default constructor 

// B
// 	default constructor 

// C 
// 	default constructor 

// child k through access 