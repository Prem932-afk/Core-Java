import java.util.function.Predicate;

public class PredicateExample 
{
    public static void main(String[] args) 
    {
        Predicate<Integer> p = (Integer t) -> 
        {
            if (t > 100) 
            {
                return true;
            } 
            else 
            {
                return false;
            }
        };

        System.out.println(p.test(1000));  // true
        System.out.println(p.test(50));    // false
    }
}
