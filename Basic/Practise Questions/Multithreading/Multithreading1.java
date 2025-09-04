
public class Multithreading1  extends Thread //1.Extend Thread class
{
    public void run()//2. Override the method
    {
        System.out.println("Thread is Running");
    }
    public static void main(String[] args) 
    {
        Multithreading1 m=new Multithreading1();//3. Create object
         m.start();//4. Start method
    }    
}
