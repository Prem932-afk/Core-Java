//3. N natural Number
import java.util.*;
public class B3 
{
     public static void main(String[] args) 
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your Number");
       int n=sc.nextInt();

       for(int i=1; i<=n; i++)
       {
         System.out.println(i);
       }   
       sc.close();
     }
}
