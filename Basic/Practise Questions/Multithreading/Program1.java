//1. Extend Thread class
class Program1 extends Thread
{
    public void run()
    {
        System.out.println("Extend Thread class");
    }
    public static void main(String[] args) 
    {
        Program1 p=new Program1();
         p.run();
    }
}
