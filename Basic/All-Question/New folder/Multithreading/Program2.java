class Program2 implements Runnable
{
    public void run()
    {
        System.out.println("Run method");
    }
    public static void main(String[] args) 
    {
         Program2 p=new Program2();
          
         Thread th=new Thread(p);
   
         th.start();
         
    }
}
