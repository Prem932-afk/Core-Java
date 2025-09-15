//1 List Create

import java.util.ArrayList;
import java.util.List;
public class Program2 
{
    public static void main(String[] args) 
    {
         List l=new ArrayList<>();

         l.add("100");
         l.add("50");
         l.add("Rahul");
         l.add(null);

         System.out.println(l);

         System.out.println(l.get(1));
           
    }
}
