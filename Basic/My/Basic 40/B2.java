//2. Add Two number

import java.util.Scanner;
public class B2 
{
 public static void main(String[] args) 
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your First Number");
    int fist=sc.nextInt();

    System.out.println("Enter your Second Number");
    int second=sc.nextInt();

    int add=fist + second;
    System.out.println("Sum of Two Number :" +add);

    sc.close();
 }    
}
