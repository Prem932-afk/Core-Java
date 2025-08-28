//1. Performing single task from single thread.

public class P3 extends Thread
{
    public void run()
    {
        System.out.println("Run method");
    }
  public static void main(String[] args) 
  {
      P3 p=new P3();
        p.start();
  }    
}
