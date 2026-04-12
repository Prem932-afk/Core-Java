import java.util.*;

class Cl1
{
    public static void main(String args[])
    {
        Collection fruits=new ArrayList<>();   
        {
             fruits.add("Banana");
             fruits.add("Mango");
             fruits.add("Orange");     
             fruits.add("Papaya");
             
             System.out.println(fruits);

        }

        //.........................Collctions..........................

         List number=new ArrayList<>();

         number.add(10);
         number.add(2);
         number.add(4);
         number.add(1);

         Collections.sort(number);

         System.out.println(number);
    }
}