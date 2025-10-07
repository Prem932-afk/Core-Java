//7. Calculate sum of odd or even number ?

import java.util.*;
public class P7 
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your range");
    int n=sc.nextInt();
    int sum=0;

    if(n%2==0)
    {
        for(int i=0; i<=n; i=i+2)
        {
            sum= sum + i;
        }
    }
    else
    {
        for(int i=1; i<=n; i=i+2)
        {
            sum= sum + i;
        }
    }
    System.out.println("Your sum value : " + sum);
    sc.close();
  }    
}
