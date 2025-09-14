public class M1 extends Thread
{
    public void run()
    {
        System.out.println("Run method");
    }
   public static void main(String[] args) 
   {
       M1 m=new M1();
        //m.start();
   }    
}
