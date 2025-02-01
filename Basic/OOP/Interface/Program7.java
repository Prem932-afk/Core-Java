
interface A1
{
    private int square(int a)
    {
        return a*a;
    }
    default void accessAquare(int a)
    {
       System.out.println(square(a));
    }
}
interface B1 extends A1
{
    default void show(String name)
    {
        System.out.println(name);
    }
}
interface C1 extends B1
{
    int m();
    interface innerInt
    {
        void innerMeth();
    }
}
interface D1 extends C1
{
    void set();
    class E1
    {
        public void show1()
        {
            System.out.println("Its The End");
        }
    }
}

class F extends D1.E1 implements D1,D1.innerInt
{
    public int m()
    {
        return 69;
    }
    public void innerMeth()
    {
        System.out.println("We are in Middle");
    }
    public void set()
    {
        System.out.println("To the end");
    }

}
 /* 
interface A
	private method :return and argument 

interface B ex A
	default method :no return and argument 

interface C ex B
	method :return and no argument 

	interface :method 

interface D ex C
	method :no return and no argument 
	class : 

class : access 

*/
