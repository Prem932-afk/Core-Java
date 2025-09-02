//Q.15 Write a java program to calculate area of an equilateral triangle ?
import java.util.Scanner;
public class P15
{
  public static void main(String[] args) 
  {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your height");
        int height=sc.nextInt();

        System.out.print("Enter your base");
        int base=sc.nextInt();

        int area=1/2*base*height;
        System.out.println("Trainle area :"+area);
  }    
}
//Write a java program to calculate area of an equilateral triangle.
//area=1/2*base*height;

