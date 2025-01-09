class Program1
{
    public static void main(String[] args) 
    {
        B b=new B();
         b.show();    
    }
}

interface A
{
    void show();
}
class B implements A
{
     public void show()
    {
        System.out.println("No return & No argument");
    }
}