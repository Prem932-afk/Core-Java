// OOPs Variables

class P1
{
    int a=10; //Instance variable
    static int c=30; //Static variable

    void var()
    {
      int b=20;
      System.out.println("Local Varible :" + b); //local variable
    }
    public static void main(String args[])
    {
       P1 p=new P1();
        System.out.println("Instance variable :" + p.a);

        p.var(); // call method to use local variable

       System.out.println("Static variable " + P1.c);// static variable

    }
}