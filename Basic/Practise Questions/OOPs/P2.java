// OOPs methods

public class P2 
{
  void show()
  {
    System.out.println("instance method");
     show2();
  }

  static void show2()
  {
    System.out.println("Static method");
  }
  public static void main(String[] args) 
  {
       P2 p=new P2();
        p.show();

  }    
}
