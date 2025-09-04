
//2.Performing single task from Multiple thread.
public class Multithreading4 extends Thread
{
    public void run()
    {
        System.out.println("Performing single task from Multiple thread.");
    }
    public static void main(String[] args) 
    {
        Multithreading4 m=new Multithreading4();
         m.start();

        Multithreading4 m1=new Multithreading4();
         m1.start(); 
    } 
}
