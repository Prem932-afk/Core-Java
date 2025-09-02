//2. Implements Runnable Interface

class Program2 implements Runnable //1. Implements Runnable Interface
{
    public void run()//2. Override voir method
    {
        System.out.println("Implemetn Runnable Interface");
    }
    public static void main(String[] args) 
    {
        Program2 p=new Program2();

         Thread th=new Thread(p);//3. Create object thread class
          th.start();//4.Start method
    }
}
