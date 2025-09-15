class runable implements Runnable
{
    public void run()
    {
        System.out.println("Implements runnable Interface");
    }
    public static void main(String[] args) 
    {
        runable r=new runable();

        Thread th=new Thread(r);

         th.start();
    }
}
