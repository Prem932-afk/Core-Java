//8. Charector is vowel or Consonent ?
import java.util.*;
public class P8 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you chareater");
        char ch=sc.next().charAt(0);
        
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.println("Character is Vowel");
        }
        else
        {
            System.out.println("Character is consonent");
        }
    }
}
