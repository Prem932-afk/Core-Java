class P2  implements Runnable //1. Implements runnable itnerface
{
     
    public void run() //2. Override Run method
    {
        System.out.println("Runable Interface");
    }
  public static void main(String[] args) 
  {
       P2 p=new P2(); //3. Crete object of P2 class

       Thread th=new Thread(p); //4. Crate object of Thread class 

       th.start();
  }    
}
