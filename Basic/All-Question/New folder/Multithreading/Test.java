class Test extends Thread 
{
    public void run()
    {
        for(int i=1; i<=3; i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

}

class Main
{
   public static void main(String[] args) 
   {
        Test t=new Test();
        Test t1=new Test();
 
        t.start();
        t1.start();
   }    
}
