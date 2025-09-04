import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class Collection2 
{
  public static void main(String[] args) 
  {
     List l=new ArrayList<>();
      
       l.add(100);
       l.add("Rahul");
       l.add(1.9);

       Iterator itr = l.iterator();

       while(itr.hasNext())
       {
         System.out.println(itr.next());
       }
  }    
}
