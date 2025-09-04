import java.util.ArrayList;
public class Collection1 
{
   public static void main(String[] args) 
   {
     ArrayList al=new ArrayList<>();
       
       al.add(100);
       al.add(null);
       al.add(100);
       al.add(null);
       al.add("Rahul");

    System.out.println(al);

    System.out.println("...................1.Containe............................");
    System.out.println(al.contains(100));
    System.out.println(al.contains(100));

    System.out.println("...................2.Size............................");
    System.out.println(al.size());

    System.out.println("...................3.Second Array............................");

     ArrayList al2=new ArrayList<>();
      
       al2.add(200);
       al2.add("Shubam");
       al2.add(5.5);

    System.out.println(al2);

    System.out.println("...................4.Add All............................");

    al.addAll(al2);

    System.out.println(al);
   }    
}
