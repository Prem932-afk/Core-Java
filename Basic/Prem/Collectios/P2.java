//2. Collections Example ?

import java.util.*;
import java.util.Collections;
class P2
{
    public static void main(String args[])
    {
        //Here ArrayList implmentin Collection
        List<Integer> number = new ArrayList<>();   

          number.add(12);
          number.add(4);
          number.add(15);
          number.add(2);

          Collections.sort(number);
          System.out.println(number);
    }
}