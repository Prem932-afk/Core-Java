import java.util.Scanner;
 class Centimeterconvert
{
   public static void main(String[] args) 
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your length in cetimeter :");
     double centimeter=sc.nextDouble();

     double meter=centimeter/100;
     double kilometer=centimeter/100000;

     System.out.println("Length in meters: " + meter);
     System.out.println("Length in kilometers: " + kilometer);
    
   }    
}
