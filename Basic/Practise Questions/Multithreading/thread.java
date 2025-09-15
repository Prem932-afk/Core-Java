class thread extends Thread
{
    public void run()
    {
        System.out.println("Extemd Thread");
    }
    public static void main(String[] args) 
    {
         thread t=new thread();
         t.start();
    }
}
