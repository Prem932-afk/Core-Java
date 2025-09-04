//1.Performing single task from single thread.

public class Multithreading3 extends Thread
{
    public void run()
    {
        System.out.println("Single Task form Single Thread");
    }
    public static void main(String[] args) 
    {
        Multithreading3 m=new Multithreading3();
        m.start();
    }
}
