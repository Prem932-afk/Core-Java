
import java.util.*;
public class P2 
{
    public static void main(String[] args) 
    {
        List<Integer> list=Arrays.asList(1,2,2,3,4,3);   
        
        Set set= new LinkedHashSet(list);

        System.out.println(set);
    }
}
