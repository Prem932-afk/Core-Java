public class Program1 extends Thread
{
    public void run()
    {
        System.out.println("Single Thread & Single Task");
    }
    public static void main(String[] args) 
    {
        Program1 p=new Program1();
         p.start();
    }
}
