
import java.util.*; 
public class LS 
{
  public static void main(String[] args) 
  {
     List  l=new ArrayList<>();

     l.add(10);
     l.add(null);
     l.add(null);
     l.add(10);
     l.add("Prem");

     System.out.println(l);

     //....................................................

     Set s=new HashSet<>();

     s.add(10);
     s.add(null);
     s.add(null);
     s.add(10);
     s.add("Singh");

     System.out.println(s);
  }    
}
