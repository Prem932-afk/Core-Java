public class P5 
{
 public static void main(String[] args) 
 {
     A obj=new A();
       obj.a=100;
       obj.b=200;

     obj.display();
 }    
}

class A
{
    int a;

    int b;

    A show()
    {
        System.out.println("Method call");
        return this;
    }

    void display() 
    {
        System.out.println("a = " + a + ", b = " + b);
    }
}
