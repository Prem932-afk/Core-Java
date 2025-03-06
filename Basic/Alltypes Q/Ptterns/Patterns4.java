/*
 Patterns 4 : *
              **
              ***
              ***
              **
              *
 */
public class Patterns4 
{
  public static void main(String[] args) 
  {
    for(int i=1; i<=3; i++)
    {
        for(int j=1; j<=i; j++)
        {
            System.out.print("*");
        }
        System.out.println(" ");
    }
    int i=2;
    for( i=2; i>=0; i--)
    {
        for(int j=1; j<=i; j++)
        {
            System.out.print("*");
        }
        System.out.println(" ");
    }
  }    
}
