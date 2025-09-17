// 4. Write a java program to Print odd number?

import java.util.*;
public class P4 
{
   public static void main(String[] args) 
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your number");
      int n=sc.nextInt();
      
      for(int i=1; i<=n; i=i+2)
      {
        System.out.println(i);
      }
      sc.close();
   }   
}
