//5. Write a java program to enter length and breadth of a rectangle and find its area.? 

import java.util.*;
public class P5
{
  public static void main(String[] args) 
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Rectangle length");
     int length=sc.nextInt();

     System.out.println("Enter Rectangle breadth");
     int breadth=sc.nextInt();

     int are=2* (length + breadth);
     System.out.println("Rectnagle Area :" + are);
  }    
}