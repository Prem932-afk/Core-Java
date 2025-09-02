//11. Greatest between2 number?

import java.util.*;
public class P11 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number");
        int fn=sc.nextInt();
        System.out.println("Enter your second number");
        int sn=sc.nextInt();
        
        if(fn>sn)
        {
            System.out.println("Number first is greater");
        }
        else
        {
            System.out.println("Number second is greater");
        }
    }
}
