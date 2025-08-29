//charAt()
//length()

import java.util.*;
public class S1 
{
  public static void main(String[] args) 
  {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Name");
       String name=sc.nextLine();
       int len=name.length();
       
       for(int i=0; i<len; i++)
       {
           System.out.println(name.charAt(i));
       }

      
       System.out.println("Your Name length : " + len);
  }    
}
