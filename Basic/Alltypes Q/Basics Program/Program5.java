// Q.1 Write a java program to enter length and breadth of a rectangle and find its area.
import java.util.Scanner;
public class Program5 
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Rectange Length");
       int length=sc.nextInt();
       System.out.println("Enter Rectangle breadth");
       int breadth=sc.nextInt();
       
       int area=length*breadth;
       System.out.println("Rectangel area :"+area);
       sc.close();
    }
}

/*
      area of rectange = length * breadth;
 */
