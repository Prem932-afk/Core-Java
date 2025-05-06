

//13. Write a java program to enter two angles of a triangle and find the third angle.


import java.util.*;
public class B13
{
  public static void main(String[] args) 
  {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter trinagl first angle :");
        double firstangle=sc.nextDouble();
        
        System.out.print("Enter trianlge second angle :");
        double secondangle =sc.nextDouble();
        double thirdAngle= 180-(firstangle+secondangle);
		
        if(firstangle<=0 || secondangle<=0)
        {
            System.out.println("Error: Angles must be positive numbers.");
        }
        else if(firstangle+secondangle >= 180)
        {
            System.out.println("Error: The sum of the two angles must be less than 180 degrees");
        }
        else
        {
            System.out.println("The third angle of the triangle is: \" + thirdAngle + \" degrees.");
        }
  }    
}


