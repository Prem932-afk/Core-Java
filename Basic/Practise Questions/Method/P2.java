//2. No return & Argument

public class P2 
{
    public static void main(String[] args) 
    {
        Demo d=new Demo();
         d.show(10);
         d.display();
    }
}

class Demo
{
    int a;
    void show(int a)
    {
        this.a=a;
        System.out.println(a);
    }

    void display()
    {
        System.out.println("No return & Argument");
    }
}
