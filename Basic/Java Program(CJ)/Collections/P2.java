//2. Collections Example

import java.util.*;
public class P2 
{
    public static void main(String[] args) 
    {
       List<Integer> number=new ArrayList<>();
         number.add(30);
         number.add(54);
         number.add(2);
         number.add(12);

        Collections.sort(number);

        System.out.println(number);
    }
}
