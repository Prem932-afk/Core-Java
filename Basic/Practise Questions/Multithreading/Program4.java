//2. Performing single task from Multiple thread.
class Program4 extends Thread
{
    public void run()
    {
        System.out.println("Performing single task from Multiple thread.");
    }

    public static void main(String[] args) 
    {
        Program4 p=new Program4();
         p.start();    

        Program4 p1=new Program4();
         p1.start();   
    }
}
