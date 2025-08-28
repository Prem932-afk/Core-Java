//Local class
public class P6 
{
  public static void main(String[] args) 
  {
     Outer o=new Outer();
      o.show();
  }    
}

class Outer
{
    int a, b;

    void show()
    {
        class inner
        {
            void showMe()
            {
                System.out.println("Inner class method call");
            }
        }
        inner i=new inner();
          i.showMe();
    }
}
