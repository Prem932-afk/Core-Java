//5. Performing Multiplee task from Multiple thread.

class Multithreading5 extends Thread
{
 public void run()
 {
      System.out.println("Thread 1");
 }    
}

class Multithreading6 extends Thread
{
 public void run()
 {
      System.out.println("Thread 2");
 }    
}

class Main
{
    public static void main(String[] args) 
    {
        Multithreading5 m=new Multithreading5();
         m.start();
        
        Multithreading6 m1=new Multithreading6();
         m1.start();
    }
}

