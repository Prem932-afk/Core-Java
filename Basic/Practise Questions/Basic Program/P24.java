//46. Triangle side value

import java.util.*;
//import java.Lang.Math;
class P24
{
    public static void main(String[] args) 
    {
       int a,b,c,sb;
       System.out.println("Enter value of triangle");
       Scanner sc=new Scanner(System.in);
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();    

       sb=(a+b+c)/2;

       double area=Math.sqrt(sb*(sb-a)*(sb-b)*(sb-c));
       System.out.println("Area of Triangle :" + area);
    }
}