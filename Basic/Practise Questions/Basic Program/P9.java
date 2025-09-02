//9. Pirnt Ascii number
import java.util.*;
public class P9 
{
     public static void main(String args[])
     {
         char ch;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter your chracter");
         ch=sc.next().charAt(0);

         int n=ch;

         System.out.println("Your ASCii number  " +  n + " Charchter of : " + ch);

     }
}
