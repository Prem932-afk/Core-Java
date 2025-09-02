//21. Clcaulater

import java.util.*;
public class P20 
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your number");
    int n=sc.nextInt();
    System.out.println("Enter two number");
    int a=sc.nextInt();
    int b=sc.nextInt();
    if(n==1)
    {
        System.out.println(a+b);
    }
    else if(n==2)
    {
        System.out.println(a-b);
    }
    else if(n==3)
    {
        System.out.println(a/b);
    }
    else if(n==4)
    {
        System.out.println(a%b);
    }
    else
    {
        System.out.println("Not match");
    }
  }    
}
