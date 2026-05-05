
//10. Calculate power of N number.

import java.util.*;
public class P10 
{
  public static void main(String[] args) 
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter power number");
      int p=sc.nextInt();
      
      System.out.println("Enter N number");
      int n=sc.nextInt();

      int result=1;

      for(int i=1; i<=p; i++)
      {
        result=result * n;
      }

      System.out.println(result);
  }    
}
