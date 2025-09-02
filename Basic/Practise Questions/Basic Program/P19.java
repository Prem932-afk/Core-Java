//19. Tax Clculate

import java.util.*;
public class P19 
{
  public static void main(String[] args) 
  {
       double tax=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your number");
       int Salary=sc.nextInt();

       if(Salary<=10000)
       {
        System.out.println("No Tax");
       }
       else if(Salary>10000 && Salary<=100000)
       {
          tax=Salary * 0.10;
          System.out.println(tax);
       }
        else 
       {
          tax=Salary * 0.20;
          System.out.println(tax);
       }
  }    
}
