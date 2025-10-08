//1. String lenght , charAt

import java.util.*;
class P1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String");
        String s=sc.nextLine();

        int length=s.length();   
        System.out.println("String Size is : " + length);

        for(int i=0; i<length; i++)
        {
            System.out.println(s.charAt(i));
        }
    }
}