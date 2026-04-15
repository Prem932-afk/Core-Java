
//1. Extend Thread class
class M1 extends Thread
{
    //2.override the run method
    public void run()
    {
        System.out.println("Overide the run method");
    }
    public static void main(String[] args) 
    {
        //3.Create an object of M1 class 
         M1 m=new M1();
          m.start();//4. import the thread 
    }
}