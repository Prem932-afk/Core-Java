//1. Collections
import java.util.*;
import java.util.ArrayList;
class C1
{
    public static void main(String args[])
    {
        ArrayList al=new ArrayList<>();

        al.add(null);
        al.add(null);
        al.add(100);
        al.add(100);
        al.add("Rahul");
        al.add("Shubam");
        
        System.out.println(al);

       //1. Containe
       System.out.println(al.contains(100));

       //2. Size 
       System.out.println(al.size());

       
    }
}