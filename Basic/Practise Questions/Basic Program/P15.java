//15. Factorial Number ?

import java.util.Scanner;

public class P15 
{
  public static void main(String[] args) 
  {
       int n;
       int fact=1;
       System.out.println("Enter your number");
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();

       for(int i=1; i<=n; i++)
       {
         fact= fact * i;
       }
         System.out.println(fact);

  }    
}
