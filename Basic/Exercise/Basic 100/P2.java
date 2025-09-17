//2. Write a Java program to enter two numbers and find their sum ?

import java.util.*;
public class P2 
{
    public static void main(String[] args) 
    {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter First Number");
          int first=sc.nextInt();
          
          System.out.println("Enter your Second Number");
          int Second=sc.nextInt();

          int sum=first + Second;
          System.out.println("Your Sum Number : " + sum);
    }
}
