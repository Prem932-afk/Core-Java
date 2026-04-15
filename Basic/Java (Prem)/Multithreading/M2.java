//1. Implements Runnable interface
public class M2 implements Runnable
{

    //2. Override run method
    public void run()
    {
        System.out.println("Overide run method");
    }
    public static void main(String[] args) 
    {
        //3. Creat an object of M2 class 
        M2 m=new M2();

        Thread th=new Thread(m);
        //4.Create an object of Thread class and parameters

        th.start();
    }
}
