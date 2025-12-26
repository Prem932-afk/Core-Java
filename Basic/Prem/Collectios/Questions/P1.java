//Q.1 Duplicate lements Find

import java.util.*;

class P1
{
    public static void main(String[] args) 
    {
       int arr[]={1,2,3,2,4,1};
       
       Set<Integer>set=new HashSet<>();

        for(int num : arr)
        {
              if(!set.add(num))
              {
                 System.out.println(num);
              }
        }
    }
}