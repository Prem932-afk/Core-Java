
import java.util.*;
public class ST1
{
  public static void main(String args[])
  {
     Stack s=new Stack<>();

     s.push("rahul");
     s.push("rahul");
     s.push(null);
     s.push(null);
     s.push(10);

     System.out.println(s);

     System.out.println(s.peek());

     System.out.println(s.pop());

     System.out.println(s.pop());
  }   
}
