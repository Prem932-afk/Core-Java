public class Program2 
{
    public static void main(String[] args) 
    {
         
         A a=new A();
          a.show();
          a.show1(2);
          a.show2();
    }
}
class A
{ 
    A()
    {
        System.out.println("Construcutre ");
    }
    
    void show()
    {
        System.out.println("No return & No argument");
    }

    int show1(int n)
    {
        System.out.println("return & argument");
        return n;
    }

    int show2()
    {
        int n=2;
        System.out.println("return & No argument");
        return n;
    }
}

// class A
// 	constructor 
// 	method :
// 	no return and no argument 
// 	return and argument 
// 	return and no argument 

// 	call two ways : 
