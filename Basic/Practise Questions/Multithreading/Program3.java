//3. Performing Multiplee task from Multiple thread.
public class Program3 extends Thread
{
      public void run()
      {
        System.out.println("Thread-1");
      }
}

class Program4 extends Thread
{
      public void run()
      {
        System.out.println("Thread-2");
      }
}

class main
{
    public static void main(String[] args) 
    {
           Program3 p1=new Program3();
            p1.start();
            
           Program4 p2=new Program4();
            p2.start();
    }
}
