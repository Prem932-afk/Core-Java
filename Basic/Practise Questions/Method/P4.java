//return & No argument

public class P4 
{
  public static void main(String[] args) 
  {
     Demo d=new Demo();
       d.show();
       d.display();
  }    
}

class Demo
{
    
    int show()
    {
       int a=10;
       System.out.println("A value :" + a);
       return a;
    }

    void display()
    {
        System.out.println("Return & No argument method");
    }
}