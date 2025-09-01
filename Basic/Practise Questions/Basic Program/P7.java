//7. Callculate sum of odd & even number?

import java.util.*;
public class P7 
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number range");    
       int n=sc.nextInt();
       int sum=0;

       if(n%2==0)
       {
          for(int i=1; i<=n; i=i+2)
          {
             sum=sum + i;
              
          }
          System.out.println("Sum of Odd number : " + sum);
       }
       else
       {
         for(int i=1; i<=n; i=i+2)
          {
             sum=sum + i;
              
          }
          System.out.println("Sum of Even number : " + sum);
       }
    }
}
