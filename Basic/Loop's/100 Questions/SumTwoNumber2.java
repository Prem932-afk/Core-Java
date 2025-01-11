import java.util.*;
public class SumTwoNumber2 
{
   public static void main(String[] args) 
   {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter firs number :");
    int a=sc.nextInt();

    System.out.print("Enter second number :");
    int b=sc.nextInt();

    int  sum=a+b;
    System.out.println("Sum of two number:"+sum);
    sc.close();
   }   
}

