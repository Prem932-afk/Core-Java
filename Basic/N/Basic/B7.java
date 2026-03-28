
import java.util.*;
public class B7 
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number Range");
       int range=sc.nextInt();
       int sum=0;
       
       if(range % 2==0)
       {
           for(int i=0; i<=range; i=i+2)
           {
              sum=sum + i;
           }
           System.out.println(sum);
       }
       else
       {
           for(int i=1; i<=range; i=i+2)
           {
              sum=sum + i;
           }
           System.out.println(sum);
       }
       sc.close();
    }
}
