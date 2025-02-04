
// class 
// 	static class 
// 		method :non-static :no return and no argument  

// access 





class A
{
    static class B
    {
        void show(){
            System.out.println("Hello");
        }
    }
}
public class Program1
{
    public static void main(String[] args) 
    {
        A.B p = new A.B();
        p.show();
    }
}