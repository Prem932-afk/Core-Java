interface parent
{
   default void sayBay()
   {
      System.out.println("Bye");
   }
    
}

interface child 
{
    default void sayBay()
   {
      System.out.println("Bye 2");
   }
}

public class Test implements parent, child
{
    public static void main(String[] args) 
    {
         Test t=new Test();
          t.sayBay();
    }

    public void sayBay()
    {
         parent.super.sayBay();
    }
}