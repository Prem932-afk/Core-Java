//1. Collection Arraylist

import java.util.ArrayList;
public class Program1 
{
   public static void main(String[] args) 
   {
       ArrayList al=new ArrayList<>();
        al.add("100");
        al.add("100");
        al.add("null");
        al.add("null");
        al.add("Rahul");

        System.out.println(al);

        //1. Conataine

        System.out.println(al.contains("100"));

        //2. Size 

        System.out.println(al.size());


        
   }    
}
