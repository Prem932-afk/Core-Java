
import java.util.List;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
public class Program5 
{
  public static void main(String[] args) 
  {
    Vector v=new Vector();
     v.add(100);
     v.add("Rahull");
     v.add(null);

    Enumeration e= v.elements();
    
    while(e.hasMoreElements())
    {
         System.out.println(e.nextElement());
    }
  }    
}
