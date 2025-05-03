// A :
// 	method one 
// B:
// 	method one 
// C:
// 	method three
// D:
// 	method four  

class A3
{
    public static void main(String[] args) 
    {
        A a = new A();
         a.method1("Method 1");
         a.method2(4);   
    }
}

class A 
{
    String method1(String name)
    {
        System.out.println("name");
        return name;
    }

    int method2(int n)
    {
        System.out.println(n);
        return n;
    }
}