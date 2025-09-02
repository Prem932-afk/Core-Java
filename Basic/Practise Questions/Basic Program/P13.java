//12. Greatest between 3 number?

import java.util.*;
public class P13
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number");
        int fn=sc.nextInt();
        System.out.println("Enter your second number");
        int sn=sc.nextInt();
        System.out.println("Enter third number");
        int tn=sc.nextInt();
        
        if(fn>sn)
        {
             if(fn>tn)
             {
                System.out.println(fn);
             }
             else
             {
                System.out.println(tn);
             }
        }
        else if(sn>tn)
        {
             if(sn>tn)
             {
                System.out.println(sn);
             }
             else
             {
                System.out.println(tn);
             }
        }
        else
        {
            System.out.println("Condition not match");
        }
    }
}

