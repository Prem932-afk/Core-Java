public class Method6 {
    public static void main(String[] args) {
        new A();
    }
}
class A
{
    A()
    {    
        this('R');
        System.out.println("Cons-1");
    }
    A(int a)
    {   
        this("Ram");
        System.out.println("A :"+a);
    }
    A(int a,int b)
    {
        System.out.println("A :"+a+"B :"+b);
    }
    A(float a)
    { 
        this(5,6);
        System.out.println("A :"+a);
    }
    A(char a)
    {
        this(3);
        System.out.println("A :"+a);
    }
    A(String name)
    {
        
        System.out.println("Nmae :"+name);
    }
}
// constructor chaining :
// A() 1 :1---5
// A() 2 :first 2---6
// A() 3 :
// A() 4 :4--3
// A() 5 :5--4
// A() 6 :6---1