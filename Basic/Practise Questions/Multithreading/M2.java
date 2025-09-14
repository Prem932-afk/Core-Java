public class M2 implements Runnable
{
  public void run()
  {
    System.out.println("Runnable Interface");
  }
  public static void main(String[] args) 
  {
        M2 m=new M2();
      
        Thread th=new Thread(m);
     
        th.start();

  }    
}
