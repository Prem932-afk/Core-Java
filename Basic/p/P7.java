//Q.7 Write a Java program to Callculate sum of odd & even number ? 

import java.util.*;
public class P7 
{
  public static void main(String[] args) 
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your number");
     int n=sc.nextInt();

     int sum=0;
    if(n%2==0)
    {
       for(int i=0; i<=n; i=i+2)
       {
           sum = sum + i;
       }
        System.out.println("Sum of Even Numbers up to " + n + " = " + sum);
    }
    else
    {
       for(int i=1; i<=n; i=i+2)
       {
           sum = sum + i;
       }
       System.out.println("Sum of Odd Numbers up to " + n + " = " + sum);
    }

  }    
}
