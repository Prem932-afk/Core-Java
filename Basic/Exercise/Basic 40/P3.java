//3. Write a Java program to Sum of n natural number ?

import java.util.Scanner;

public class P3 
{
  public static void main(String[] args) 
  {
      int sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your number");
      int n=sc.nextInt();

      for(int i=1; i<=n; i++)
      {
        sum=sum + i;
        System.out.println(sum);
      }
      sc.close();
  }    
}
