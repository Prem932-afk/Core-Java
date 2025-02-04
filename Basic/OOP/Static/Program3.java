
// class 
// 	static class :
// 		method :return and no argument 

// 	class :
// 		method :return and argument 

// access 



class A
{
    static class B
    {
        int show()
        {
            System.out.println("2563");

            return 0;
        }
    }
    class C
    {
        char show1(char a)
        {
            System.out.println(a);

            return a;
        }
    }
}
public class Program3 
{

    public static void main(String[] args) 
    {
        A.B p = new A.B();
        p.show();

        A q = new A();
        A.C c =q. new C();
        c.show1('J');
    }
}
