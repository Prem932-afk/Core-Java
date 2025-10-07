//8. Character is vowel or consonent ?

import java.util.*;
public class P8 
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your charaeter");
       char ch=sc.next().charAt(0);
       
       if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
       {
          System.out.println("Charcter is Vowel");
       }
       else
       {
        System.out.println("Character is Consonet");
       }
    }
}
