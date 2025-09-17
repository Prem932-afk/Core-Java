//1. Write a Java program to perform input/output of all basic data types ?

import java.util.*;
class P1
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
     
       //1. Integer Value
       System.out.println("Enter Integer Data-Type");
       int i=sc.nextInt();
       System.out.println("Integer Value : " + i);    

       //2. Float Value
       System.out.println("Enter Float Data-Type");
       float f=sc.nextFloat();
       System.out.println("Float Value : " + f);
      
       //3. Character Value
       System.out.println("Enter Character Data-Type");
       char ch=sc.next().charAt(0);
       System.out.println("Charetor Value : " + ch);

       sc.nextLine();

       //4. String Value
       System.out.println("Enter String Data-Type");
       String s=sc.nextLine();
       System.out.println("String Value : " + s);

       //5. Boolean Value
       System.out.println("Enter Boolean Data-Type");
       boolean b=sc.nextBoolean();
       System.out.println("Boolean Value : " + b);

    }
}