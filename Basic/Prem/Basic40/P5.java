//5. Print odd number giving range ?

import java.util.*;
public class P5 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number");
        int n=sc.nextInt();

        for(int i=1; i<=n; i=i+2)
        {
              System.out.println(i);
        }

    }
}
