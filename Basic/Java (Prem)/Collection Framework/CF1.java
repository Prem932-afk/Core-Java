import java.util.*;

class CF1
{
    public static void main(String args[])
    {
        Collection fruits = new ArrayList();

        fruits.add(10);
        fruits.add("Rahul");
        fruits.add(20);
        fruits.add("Shubam");

        System.out.println(fruits);

        System.out.println(".............................................................................");

        List number = new ArrayList<>();

        number.add(10);
        number.add(2);
        number.add(40);
        number.add(3);
        number.add(0);

        Collections.sort(number);
        
        System.out.println(number);
    }
}