

public class Multithreading2 implements Runnable  //1.Runnable implements
{
     public void run()//2. Override method
     {
        System.out.println("Method is running");
     }
     public static void main(String[] args) 
     {
                
        Multithreading2 m=new Multithreading2();//3. Object creating

        Thread th=new Thread(m); //4.Thread Object creating

         th.start();
         

     }
}
