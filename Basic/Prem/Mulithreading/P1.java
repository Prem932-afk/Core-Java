class Test extends Thread
{
    public void run()
    {
        System.out.println("Run method");
    }
    public static void main(String args[])
    {
    //     Test t=new Test();
    //      t.start();

         System.out.println(Thread.currentThread());
         System.out.println(Thread.currentThread().getName());
         Thread.currentThread().setName("Galat hai");
        System.out.println(Thread.currentThread().getName());
        int a=10;
        int b=0;
        int c=a/b;
        System.out.println(c);
    }
}