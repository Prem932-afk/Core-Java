//1. Extend Thread Class 

class P1 extends Thread
{
    public void run()
    {
        System.out.println("Method is Running");
    }
    public static void main(String[] args) 
    {
        P1 p=new P1();
         p.start();
    }
}