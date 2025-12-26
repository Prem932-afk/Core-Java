public class P4 extends Thread
{
    public void run()
    {
        for(int i=1; i<=5; i++)
        {
             try
             {
                System.out.println(i + Thread.currentThread().getName());
                Thread.sleep(1000);
             }
             catch(Exception e)
             {
                 System.out.println(e);
             }
        }
    }

    public static void main(String[] args) 
    {
        P4 p=new P4();
         p.start();   
         
        P4 p1=new P4();
         p1.start();
    }
}
