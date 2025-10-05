//4. Sum Of N natural Number ?


import java.util.*;
public class P4 
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter N natural number");
       int n=sc.nextInt();
       
       int sum=0;

       for(int i=1; i<=n; i++)
       {
          sum= sum + i;

       }
       System.out.println("sum number : " + sum);

       sc.close();
    }   
}
