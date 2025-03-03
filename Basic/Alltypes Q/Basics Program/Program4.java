
//Q.4) Write a Java program to enter length and breadth of a rectangle and find its perimeter.

import java.util.Scanner;
class Program4 
{
 public static void main(String[] args)
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter rectangle length :");
    double length=sc.nextDouble();

    System.out.println("Enter rectangle breath :");
    double breath=sc.nextDouble();

    double parameter=2* (length+breath);
    System.out.println("Rectamge parameter : " + parameter);
    sc.close();
      
 }   
}


/*
Perametier formula :
                       parameter =2* (breadth *length)
                       */
