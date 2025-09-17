//4.  Write a Java program to enter length and breadth of a rectangle and find its perimeter ? 

import java.util.*;
public class P4 
{
  public static void main(String[] args) 
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Rectangle length");
     int length=sc.nextInt();

     System.out.println("Enter Rectangle breadth");
     int breadth=sc.nextInt();

     int parameter=length * breadth;
     System.out.println("Rectnagle Parameters :" + parameter);
  }    
}
