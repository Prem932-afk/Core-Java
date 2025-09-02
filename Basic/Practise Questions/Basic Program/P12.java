//12. Calcaulate power of number?

import java.util.Scanner;

public class P12 
{
 public static void main(String[] args) 
 {
    int result=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int n=sc.nextInt();
    System.out.println("Enter power");
    int p=sc.nextInt();

    for(int i=1; i<=p; i++)
    {
        result=result * n;
    }
    System.out.println("Result is :" + result);
 }    
}
