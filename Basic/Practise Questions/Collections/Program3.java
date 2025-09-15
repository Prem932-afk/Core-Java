//3. Set
import java.util.HashSet;
import java.util.Set;
public class Program3 
{
     public static void main(String[] args) 
     {
         Set s=new HashSet<>();
           s.add("100");
           s.add("100");
           s.add(null);
           s.add(null);

           System.out.println(s);
     }
}
