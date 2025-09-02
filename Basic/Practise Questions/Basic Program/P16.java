
//Q.16 Count Digit ?
import java.util.*;
public class P16 
{
    public static void main(String[] args) 
    {
        int n;
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        n=sc.nextInt();

        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
