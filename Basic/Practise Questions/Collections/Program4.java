
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class Program4 
{
  public static void main(String[] args) 
  {
      List l=new ArrayList<>();

       l.add(null);
       l.add("Rahul");
       l.add(100);

       Iterator itr=l.iterator();

       while(itr.hasNext())
       {
          System.out.println(itr.next());
       }
  }    
}
