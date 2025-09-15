//2. Performing single task from Multiple thread.
public class Program2 extends Thread
{
    public void run()
    {
         System.out.println("Performing single task from Multiple thread");
    }
     public static void main(String[] args) 
     {
         Program2 p=new Program2();
          p.start();

         Program2 p1=new Program2();
          p1.start();          
     }
}
