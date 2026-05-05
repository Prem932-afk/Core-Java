//9. Find Greates Number betweeen Two number.

import java.util.*;
public class P9 
{
  public static void main(String[] args) 
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter first Number");
     int firstNumber=sc.nextInt();
     
     System.out.println("Enter second Number");
     int secondNumber=sc.nextInt();

     if(firstNumber > secondNumber)
     {
        System.out.println("First number is greater");
     }
     else 
     {
        System.out.println("Second Number is greater");
     }
  }    
}
