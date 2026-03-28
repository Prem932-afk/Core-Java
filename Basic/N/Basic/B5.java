import java.util.*;
public class B5 
{
  public static void main(String[] args) 
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your Number");

      int n=sc.nextInt();

      for(int i=0; i<=n; i=i+2)
      {
            System.out.println(i);
      }
      sc.close();
  }    
}
