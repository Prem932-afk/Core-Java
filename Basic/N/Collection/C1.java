import java.util.*;
class C1
{
    public static void main(String args[])
    {
        //Collection
        Collection<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println(fruits);

        //Colllections

        List<Integer>number=new ArrayList<>();

        number.add(9);
        number.add(2);
        number.add(6);
        number.add(1);
        number.add(13);

        Collections.sort(number);
        System.out.println(number);
    }
}