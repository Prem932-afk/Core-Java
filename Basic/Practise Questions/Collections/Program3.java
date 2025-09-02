//3. Enumeration Cursore

import java.util.Enumeration;
import java.util.Vector;

public class Program3 
{
  public static void main(String[] args)
  {
     Vector v=new Vector<>();
      v.add("Rahul");
      v.add(100);
      v.add(1.6);

      System.out.println(v);

         Enumeration e=v.elements();

         while(e.hasMoreElements())
         {
             System.out.println(e.nextElement());
         }
  }   
}
