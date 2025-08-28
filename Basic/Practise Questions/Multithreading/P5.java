//3. Performing Multiplee task from Multiple thread.

public class P5  extends Thread
{
     public void run()
     {
        System.out.println("Run 1st Method");
     }
  
}

class P6 extends Thread
{
   public void run()
   {
    System.out.println("Run 2nd Method");
   }
}

class Main
{
    public static void main(String[] args) 
    {
        P5 p=new P5();
         p.start();
         
        P6 p1=new P6();
         p1.start();
    }
}
