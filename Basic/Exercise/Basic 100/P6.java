//6.Write a Java program to enter radius of a circle and find its diameter, circumference and area ?

import java.util.*;
public class P6 
{
   public static void main(String[] args) 
   {
     final double p1=3.14;

     Scanner sc=new Scanner(System.in);
     System.out.println("Enter circle Radius");
     int radius=sc.nextInt();
     
      double diameter=2 * radius;
      double circumference=2 * 3.14 *radius;
      double area=3.14 * radius * radius;

      System.out.println("Circule diameter :"+diameter);
      System.out.println("Circule circmference :"+circumference);
      System.out.println("Circule area :"+area);
     sc.close();
   }    
}
