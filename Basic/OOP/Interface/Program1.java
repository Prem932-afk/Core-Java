class Program1
{
    public static void main(String[] args) 
    {
        B b=new B();
         b.show();  
         b.show2(2);
         b.show3();
         b.show4("java");  
    }
}

interface A
{
    void show();
    void show2(int a);
    int show3();
    String show4(String name);
}
class B implements A
{
     public void show()
    {
        System.out.println("No return & No argument");
    }
    public void show2(int a)
    {
        System.out.println("No return & argument :"+a);
    }
    public int show3()
    {
        int n=9;
        System.out.println("return and no argument ");
        return n;
    }
    public String show4(String name)
    {
        System.out.println("return and  argument :"+name);
        return name;
    }
}

// interface : 
// 	method1 :no return and no argument 
// 	method2:no return and  argument 
// 	method3: return and no argument 
// 	method4 : return and  argument 

// another class access 