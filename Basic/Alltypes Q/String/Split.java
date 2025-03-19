import java.util.Arrays;

public class Split 
{
    public static void main(String[] args) 
    {
        String s1="Hi@Hello@Hey";
        String s2[]=s1.split("@");
        System.out.println(Arrays.toString(s2));
    }    
}
