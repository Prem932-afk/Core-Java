import java.util.*;
public class B9
{
  public static void main(String[] args) 
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your Charector");
     char ch=sc.next().charAt(0);
     
    if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
    {
        System.out.println("Vowel");
    }
    else 
    {
        System.out.println("Consonent");
    }
     sc.close();
  }    
}
