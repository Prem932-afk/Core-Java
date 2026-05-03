public class M3 extends Thread
{
 public void run()
 {

     System.out.println(Thread.interrupted());
     System.out.println(Thread.currentThread().isInterrupted());
    try
    {
        
     for(int i=1; i<=5; i++)
     {
        System.out.println(i);
        Thread.sleep(1000);
     }
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
 } 
  public static void main(String[] args) 
  {
     M3 m=new M3();
     m.start();
     m.interrupt();
  }    
}
