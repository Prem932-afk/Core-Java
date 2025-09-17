//3. Write a Java program to enter two numbers and perform all arithmetic operations ?

import java.util.*;
public class P3 
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter you Operations");
    String s=sc.nextLine();

    if(s.equals("Addition"))
    {
        System.out.println("Enter First Number");
        int first=sc.nextInt();

        System.out.println("Enter Second Number");
        int second=sc.nextInt();

        int add= first  +  second;
        System.out.println("Additon Number : " +  add);
    }

    else if(s.equals("Substraction"))
    {
        System.out.println("Enter First Number");
        int first=sc.nextInt();

        System.out.println("Enter Second Number");
        int second=sc.nextInt();

        int  sub= first  -  second;
        System.out.println("Substraction Number : " +  sub);
    }

    else if(s.equals("Multiple"))
    {
        System.out.println("Enter First Number");
        int first=sc.nextInt();

        System.out.println("Enter Second Number");
        int second=sc.nextInt();

        int  mul= first  *  second;
        System.out.println("Multiple Number : " +  mul);
    }

    else if(s.equals("Divison"))
    {
        System.out.println("Enter First Number");
        int first=sc.nextInt();

        System.out.println("Enter Second Number");
        int second=sc.nextInt();

        int  div= first  /  second;
        System.out.println("Divison Number : " +  div);
    }

    else
    {
        System.out.println("Not match");
    }
    
  }    
}
