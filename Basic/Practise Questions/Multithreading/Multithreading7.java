public class Multithreading7 extends Thread
{
    public void run()
    {
       for(int i=1; i<=5; i++)
       {
         try
         {
             System.out.println(i+ " " + Thread.currentThread().getName());
            Thread.sleep(1000);
           
         }
         catch(Exception e)
         {
            
         }
       }
    }
    public static void main(String[] args) 
    {
         Multithreading7 m=new Multithreading7();
           m.start();    
         
        
         Multithreading7 m1=new Multithreading7();
           m1.start();             
    }
}
