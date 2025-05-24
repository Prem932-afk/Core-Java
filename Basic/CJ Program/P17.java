//17.Write a java program to enter  P, T, R and calculate Simple Interest?


import java.util.Scanner;

public class P17 
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number to calculate square root :");
    double number=sc.nextDouble();
    double squareroot=Math.sqrt(number);
    if(number<0)
    {
        System.out.println("Negative number");
    }
    else
    {
    System.out.println("Your squarroot number :"+squareroot);
    }
    sc.close();
  }    
}

