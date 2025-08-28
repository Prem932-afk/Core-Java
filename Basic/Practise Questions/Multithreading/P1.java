
class P1  extends Thread       //1. Extend Thread Class
{
    public void run()   //2. Override The run method
    {
        System.out.println("Thread Run");
    }
    public static void main(String[] args) 
    {
            P1 p=new P1(); // 3.Create and object of P1 class

            p.start();  //4. Start the method
    }
}