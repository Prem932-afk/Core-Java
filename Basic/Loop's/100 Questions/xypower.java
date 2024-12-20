import java.util.Scanner;
public class xypower 
{
     public static void main(String[] args) 
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter your Base :");   
          int x=sc.nextInt();
          System.out.println("Enter your exponent :");
          int y=sc.nextInt();
          double result=1;
          for(int i=1; i<=y;i++)
          {
             result=result*x;
             System.out.println("Your Result :"+result);
          }
          sc.close();
     }   
}
/*
  r=1*5=5
  r=5*5=25
  r=25*5=125
 */
