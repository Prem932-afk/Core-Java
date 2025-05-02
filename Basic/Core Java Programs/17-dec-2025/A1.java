//Q.1
// A :
// 	method 1 :hello world

import java.lang.reflect.Method;

class A1
{
    public static void main(String[] args) 
    {
        A m = new A();
         m.Method1();

    } 
}
class A
{
    void Method1()
    {
        System.out.println("Hello World");
    }
}