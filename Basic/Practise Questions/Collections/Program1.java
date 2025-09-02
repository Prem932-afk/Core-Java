//1. ArrayList

import java.util.ArrayList;
public class Program1 
{
    public static void main(String[] args) 
    {
        ArrayList al=new ArrayList<>();
        al.add(100);
        al.add(100);
        al.add(null);
        al.add(null);
        al.add("hello");
        al.add(1.0);

        System.out.println(al);

        System.out.println(".........................1.Way.................................................");

        ArrayList al2=new ArrayList<>();
        al2.add("Ram");
        al2.add("Shyam");
        al2.add("ravi");

        al.addAll(al2);
        System.out.println(al);

        System.out.println(".........................2.Way.................................................");


    }
}
