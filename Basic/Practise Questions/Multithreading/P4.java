//2. Performing single task from Multiple thread.

public class P4 extends Thread
{
     public void run()
     {
        System.out.println("Run method");
     }
  public static void main(String[] args) 
  {
     P4 p=new P4();
      p.start();

    P4 p2=new P4();
      p2.start();
  }    
}
