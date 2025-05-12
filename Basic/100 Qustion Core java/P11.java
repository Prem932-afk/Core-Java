//11. Write a java program to find power of any number x ^ y. ?


import java.util.Scanner;
public class P11 
{
   public static void main(String[] args) 
   {
      int result=1;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your number");
      int n=sc.nextInt();

      System.out.println("Enter your power");
      int p=sc.nextInt();
      for(int i=1; i<=p;i++)
      {
         result=result*n;
         System.out.println(result);
      }
   }    
}
//Write a java program to find power of any number x ^ y.
