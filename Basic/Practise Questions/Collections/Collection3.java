import java.util.ArrayList;
import java.util.HashSet;
public class Collection3 
{
 public static void main(String[] args) 
 {
    ArrayList al=new ArrayList<>();

      al.add(100);
      al.add("Hello");


     HashSet hs=new HashSet<>(al);
     
      hs.add(10);
      hs.add(10);
      hs.add(null);
      hs.add(null);
      hs.add(1.5);

      System.out.println(hs);
 }    
}
