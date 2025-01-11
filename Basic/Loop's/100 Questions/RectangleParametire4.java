
import java.util.Scanner;
class RectangleParametire4 
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

//Write a C program to enter length and breadth of a rectangle and find its perimeter.
//Perametier formula :
//parameter =2* (breadth *length)