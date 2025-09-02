//2. Iterator cursor with list

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class Program2 
{
    public static void main(String[] args) 
    {
       List l=new ArrayList<>();
       l.add(100);
       l.add("hello");
       l.add("Shyam");
       l.add(200);

       System.out.println(l);

       System.out.println("..................1.Use Iterator Curosor...............................");

           Iterator itr=l.iterator();
           while(itr.hasNext())
           {
                System.out.println(itr.next());
           }
      
       
    }
}
