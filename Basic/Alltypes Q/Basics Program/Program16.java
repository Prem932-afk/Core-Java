
import java.util.Scanner;
public class Program16
{
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first subject number :");
        int sub1=sc.nextInt();
        
        System.out.println("Enter Second subject number :");
        int sub2=sc.nextInt();
        
        System.out.println("Enter Third subject number :");
        int sub3=sc.nextInt();
        
        System.out.println("Enter fourth subject number :");
        int sub4=sc.nextInt();
        
        System.out.println("Enter five subject number :");
        int sub5=sc.nextInt();
        
        double total =sub1+sub2+sub3+sub4+sub5;
        double average=total/5;
        double percentage=(total/500)*100;
        
        System.out.println("Result :");
        System.out.println("Average of total number : "+average);
        System.out.println("Percantage of tatal number :"+percentage);
        sc.close();

    }
}
   

//Write a Java program to enter marks of five subjects and calculate total, average and percentage?
