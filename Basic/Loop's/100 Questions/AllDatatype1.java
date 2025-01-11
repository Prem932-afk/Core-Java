import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;
public class AllDatatype1 
{
     public static void main(String[] args) 
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter your Data type and value :"); 
          System.out.println(" ");

          System.out.println("First Integer Value :");
          int i=sc.nextInt();

          System.out.println("Enter  float value :");
          float f=sc.nextFloat();

          System.out.println("Enter  Double value :");
          double d=sc.nextDouble();

          System.out.println("Enter charector value :");
          char c=sc.next().charAt(0);

          System.out.println("Enter String value :");
          String s=sc.nextLine();

          System.out.println("Enter Boolean value :");
          Boolean b=sc.nextBoolean();

     } 
}
